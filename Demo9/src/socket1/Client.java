package socket1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

// 客户端连接一个服务器的时候
// ip地址 + 端口号
public class Client {

    public static void main(String[] args) throws IOException {
        //new 的时候已经在开始建立连接了
        //new成功的时候就是三次握手建立连接完毕


        Socket socket = new Socket("127.0.0.1", 8080);

        //服务器输入的时候 也就是服务器响应
        InputStream inputStream = socket.getInputStream();
        Scanner scanner = new Scanner(inputStream, "UTF-8");


        //客户端给服务器发送内容
        // 请求的开口 是 请求方法 路径 http协议的版本号
        OutputStream outputStream = socket.getOutputStream();
        Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
        PrintWriter printWriter = new PrintWriter(writer);
        printWriter.println("xxxx \r\n");// 注意格式
        printWriter.flush();


        // 四次挥手断开连接
        socket.close();
    }

}
