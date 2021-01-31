package day31;

import java.util.Scanner;

public class D5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int nums[] = new int[n];
            int tmp = 1;
            int count = 0;
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                count ^= nums[i];
            }
            for (int i = 0; i < 32; i++) {
                if ( (tmp & count) == 1) {
                    break;
                }
                tmp <<= 1;
            }
            int a = 0;
            int b = 0;
            for (int i = 0; i < n; i++){
                if ( (nums[i] & tmp) == 1) {
                    a ^= nums[i];
                } else {
                    b ^= nums[i];
                }
            }
            if ( a > b) {
                int y = a;
                a = b;
                b = y;
            }
            System.out.println(a + " " + b);
        }
    }
}
