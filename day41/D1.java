package day41;

import java.util.Scanner;

public class D1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int len = sc.nextInt();
            int[] nums = new int[len];
            for (int i = 0; i < len; i++) {
                nums[i] = sc.nextInt();
            }
            int ret = acqMax(nums, len);
            System.out.println(ret);
        }
    }

    public static int acqMax(int[] nums, int len) {
        if (len <= 0 || nums == null) {
            return -1;
        }
        // 这里 max 不可以直接设为0；
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < len ; i++) {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
