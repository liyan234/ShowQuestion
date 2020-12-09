package day16;

import java.util.*;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int groups = sc.nextInt();
        while (groups > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] nums = new int[2 * n];
            for(int i = 0; i < 2*n; i++) {
                nums[i] = sc.nextInt();
            }
            int[] rs = new int[2*n];
            for(int i = 0; i < 2*n; i++) {
                int x = i+1;
                for(int j = 0; j < k; j++) {
                    if (x <= n) {
                        x = 2*x - 1;
                    } else {
                        x = 2 * (x - n);
                    }
                }
                rs[x - 1] = nums[i];
            }
            System.out.print(rs[0]);
            for(int i = 1; i < 2*n; i++) {
                System.out.print(" " + rs[i]);
            }
            System.out.println();

            groups--;
        }
    }
}