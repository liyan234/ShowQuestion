package socket2;

import java.io.*;
import java.net.Socket;

public class ResponseTask implements Runnable {
    private final Socket socket;

    public ResponseTask(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("建立了一条连接");

        try {
            OutputStream outputStream = socket.getOutputStream();
            Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
            PrintWriter printWriter = new PrintWriter(writer);

            printWriter.printf("HTTP/1.0 200 OK\r\n");
            printWriter.printf("Content-Tyfpe: text/html; charset=UTF-8\r\n");
            // 写入空行 代表响应头结束
            printWriter.print(" \r\n");

            //正文
            printWriter.print("<h1>xxxxxx<h1>");
            printWriter.flush();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
