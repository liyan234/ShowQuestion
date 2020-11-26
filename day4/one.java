package day4;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int pr = helpPrint(x);
            System.out.println(pr);
        }
    }

    private static int helpPrint(int x) {

        if (x < 6 || x % 2 != 0 || x == 10) {
            return -1;
        }

        if (x == 6 || x == 8) {
            return 1;
        }

        // 10以上的偶数 n6 和 n8都可以得到
        // 若 x % 8 等于 0的时候 返回
        // 若 x / 8 有余数的时候 一般为 4 和 2
        // 4 的话 就把 一个装有 8的 中拿出2
        // 2 的话 就把 两个装有 8的 中分别拿出 2

        if (x % 8 == 0) {
            return x / 8;
        }

        return 1 + x / 8;
    }
}
