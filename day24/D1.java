package day24;

import java.util.Scanner;

public class D1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int a = sc.nextInt();

            for (int i = 0; i < n; i++) {
                int h = sc.nextInt();

                if (h <= a) {
                    a += h;
                } else {
                    // 求取最大公约数
                    // 辗转相除法
                    // h > a
                    int c = gcd(a, h);
                    a += c;
                }
            }
            System.out.println(a);
        }
    }
    public static int gcd(int a, int h) {
        int x = h % a;
        while (x != 0) {
            h = a;
            a = x;
            x = h % a;
        }
        return a;
    }
}
