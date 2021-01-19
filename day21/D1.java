package day21;

import java.util.Scanner;

public class D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int month = sc.nextInt();
            System.out.println(getTotalCount(month));
        }
    }
    // 第四个月开始每月都生了一只兔子
    public static int getTotalCount(int monthCount) {
        if (monthCount <= 2) {
            return 1;
        }
        return getTotalCount(monthCount-2) + getTotalCount(monthCount-1);
    }
}
