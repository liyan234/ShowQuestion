package day16;

import java.util.*;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            if(n == 0) {
                return;
            }
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int x = sc.nextInt();
            int count = 0;
            for ( int i = 0; i < nums.length; i++) {
                if(nums[i] == x) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}