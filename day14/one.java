package day14;

import java.util.*;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            int[] nums = new int[strs.length];
            for (int i = 0; i < strs.length; i++) {
                nums[i] = Integer.valueOf(strs[i]);
            }
            for(int i = 1; i < nums.length; i++) {
                if (nums[i] != 0) {
                    System.out.print(i);
                    nums[i]--;
                    break;
                }
            }
            for(int i = 0; i < nums.length; i++) {
                while(nums[i] != 0) {
                    System.out.print(i);
                    nums[i]--;
                }
            }

        }
    }
}