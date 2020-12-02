package day9;

import java.util.Scanner;

public class one {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int x = sc.nextInt();
            double num = factorial(x);
            System.out.println(num);
            int ret = help(num);
            System.out.println(ret);
        }
    }
    private static double factorial(int x) {
        if (x == 1) {
            return 1;
        }
        return x * factorial(x - 1);
    }
    private static int help (double ret) {
        int count = 0;
        while (ret % 10 == 0) {
            count ++;
            ret = ret / 10;
        }
        return count;
    }
}
