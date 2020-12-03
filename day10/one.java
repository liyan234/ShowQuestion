package day10;

import java.util.*;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int x = sc.nextInt();
            int ret = helpFib(x);
            System.out.println(ret);
        }
    }

    private static int helpFib(int x) {
        int a = 0;
        int b = 1;
        while (x > b) {
            int temp = a;
            a = b;
            b = b + temp;
        }
        return ((b - x) > (x - a)) ? (x - a) : ( b - x);
    }
}