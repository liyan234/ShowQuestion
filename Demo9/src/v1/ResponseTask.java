package v1;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

// 服务器解析响应
//


public class ResponseTask implements Runnable {

    // 基础路径
    private final String DOC_BASE = "C:\\JavaEE_study\\Demo9\\docBase";
    private final Socket socket;
    private static final HashMap<String, String> map = new HashMap();

    public ResponseTask(Socket socket) {
        this.socket = socket;
    }

    // 前端返回的格式
    // 静态代码块
    static {
        map.put("txt", "text/plain");
        map.put("html", "text/html");
        map.put("js", "application/javascript");
        map.put("jpg", "image/jpeg");
        map.put("json", "application/jason");
    }

    @Override
    public void run() {
        System.out.println("建立了一条连接");

        try {

            //客户端发给 服务器的
            //方法 路径 版本信息
            InputStream inputStream = socket.getInputStream();
            Scanner sc = new Scanner(inputStream, "UTF-8");
            sc.next(); // 读出的东西第一个就是方法是get还是
            // 第二步就是路径
            String path = sc.next();
            // 当path为空的时候我们就需要判定是否存在
            if(path.equals("/")) {
                path = "/index.html";
            }
            // 获得路径之后就要确定是否存在该文件
            String filePath = DOC_BASE + path;
            File file = new File(filePath);

            // 如果文件存在
            if (file.exists()) {
                OutputStream outputStream = socket.getOutputStream();
                Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
                PrintWriter printWriter = new PrintWriter(writer);

                String contType = "text/html";
                // 获取格式  我们所查找的文件是何种格式
                if(path.contains(".")) {
                    int u = path.indexOf(".");
                    String str = path.substring(u+1);
                    contType = map.get(str);
                }
                if (contType.startsWith("text/")) {
                    contType = contType + "; charset=utf-8";
                }

                printWriter.printf("HTTP/1.0 200 OK\r\n");
                //
                printWriter.printf("Content-Type: %s\r\n", contType);
                //printWriter.printf("Content-Type: %s\r\n", contType);
                // 写入空行 代表响应头结束f
                printWriter.print("\r\n");
                //正文
                printWriter.flush();

                // 写入文件中的内容
                // 用 try包裹可以自动关闭输入流
                try (InputStream resourecIn = new FileInputStream(file)){
                    while (true) {
                        // 不停的读取文件中的内容
                        byte[] buffer = new byte[1024];
                        int len = resourecIn.read(buffer);
                        if (len == -1) {
                            break;
                        }
                        outputStream.write(buffer, 0, len);
                    }
                }
                outputStream.flush();

            } else {
                OutputStream outputStream = socket.getOutputStream();
                Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
                PrintWriter printWriter = new PrintWriter(writer);

                printWriter.printf("HTTP/1.0 200 OK\r\n");
                //
                printWriter.printf("Content-Type: text/html; charset=UTF-8\r\n");
                // 写入空行 代表响应头结束
                printWriter.printf("\r\n");

                //正文
                printWriter.printf("<h1>文件不存在<h1> %s", path);
                printWriter.flush();
            }

        } catch (IOException e) {
            e.printStackTrace(System.out);

        } finally {
            try {
                socket.close();
                System.out.println("释放了一条TCP连接");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
