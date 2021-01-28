package day29;

import java.util.Scanner;

public class D2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int x = sc.nextInt();
            float sum1 = fa(x);
            float sum2 = count(x);
            float ret = (sum2 / sum1) * 100;
            System.out.println(String.format("%.2f", ret) + "%");
        }
    }

    public static float count(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return (n-1) * (count(n-1) + count(n-2));
        }
    }

    public static float fa(int n) {
        float rt = 1;
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            rt = n * fa(n-1);
        }
        return rt;
    }
}
