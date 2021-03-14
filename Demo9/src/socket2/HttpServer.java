package socket2;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// 简易的服务器
// 构建一个线程池
public class HttpServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);

        while (true) {
            // 建立连接
            Socket socket = serverSocket.accept();
            // 多线程返回
            Runnable task = new ResponseTask(socket);
            new Thread(task).start();
        }
    }

}
