package day5;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int x = sc.nextInt();

            int[] nums = new int[x];
            for (int i = 0; i < x; i++) {
                nums[i] = sc.nextInt();
            }

            int hh = helpHH(x, nums, 0, 40);
            System.out.println(hh);
        }

    }

    private static int helpHH(int x, int[] nums, int index, int v) {
        //体积为0
        if (v == 0) {
           return 1;
       }
        // x==0的时候 已经没有东西了
       if (x == 0) {
           return 0;
       }
       //装的是第最后一个 index 作为数组的下标
        // x每次减1的话 就是遍历这个每行的数
       return helpHH(x-1, nums, index + 1, v - nums[index])
               + helpHH(x-1, nums, index + 1, v);
    }
}
