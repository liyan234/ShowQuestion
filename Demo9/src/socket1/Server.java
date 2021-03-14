package socket1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//服务器
// 接受客户端的命令
public class Server {
    public static void main(String[] args) throws IOException {
        //  需要设置端口号
        ServerSocket serverSocket = new ServerSocket(8080);

        // 然后需要建立连接 TCP的三次握手建立连接
        Socket socket = serverSocket.accept();

        // 通过输入输出流读取客户端发来的请求
        // 1. 先读取客户端发过来的请求
        InputStream inputStream = socket.getInputStream();
        Scanner sc = new Scanner(inputStream, "UTF-8");
        String line = sc.nextLine();
        System.out.println(line);

        // 2. 根据请求返回给客户端的响应
        // 可以使用PrintWriter
        OutputStream outputStream = socket.getOutputStream();
        Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
        PrintWriter printWriter = new PrintWriter(writer);
        // 记住返回的响应的格式 http版本号 状态码
        printWriter.printf("sanduhauo \r\n");
        printWriter.flush();// 将缓冲区中的内容刷新到TCP连接中缓冲区内容中

        // 3. 传输完内容之后就可以四次挥手结束
        socket.close();
    }
}
