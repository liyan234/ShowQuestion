package day29;

import java.util.Scanner;

public class D1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int sum = sc.nextInt();
            int[] nums = new int[n];
            long[] lo = new long[sum+1];
            lo[0] = 1;
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
                for (int j = sum ; j >= 0; j--) {
                    if (j >= nums[i]) {
                        lo[j] += lo[j - nums[i]];
                    }
                }
            }
            System.out.println(lo[sum]);
        }
    }
}
