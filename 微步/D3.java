package 微步;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class D3 {
    public static void main(String[] args) throws IOException {
        // 内存泄露
        // 就是一部分东西一直有，但是用不到
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int x = sc.nextInt();
            System.out.println(x);
            // 不做关闭
        }
        // 不做关闭
    }
}
