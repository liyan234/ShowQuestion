package day31;

import java.util.Scanner;

public class D6 {
    public static void main (String[] args) {
        // 双指针
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int left = 0;
            int right = 0;
            for (int i = 0; i < n; i++) {
                left = i - 1;
                right = i + 1;
                while (left >= 0) {
                    if (nums[left] < nums[i]) {
                        System.out.print(left + " ");
                        break;
                    }
                    left--;
                }
                if (left == -1) {
                    System.out.print( left + " ");
                }
                while (right < n) {
                    if (nums[right] < nums[i]) {
                        System.out.print(right + " ");
                        break;
                    }
                    right++;
                }
                if (right == n) {
                    System.out.print( -1 + " ");
                }
                System.out.println();
            }
        }
    }
}
