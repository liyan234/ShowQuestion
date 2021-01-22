package day24;

import java.util.Arrays;
import java.util.Scanner;

public class D2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            int students[] = new int[n];
            for (int i = 0; i < n; i++) {
                students[i] = sc.nextInt();
            }

            for (int i = 0; i < m; i++) {
                String c = sc.next();
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (c.equals("Q")) {
                    // 获取开始下标和结束下标
                    int s = Math.min(a, b);//开始下标
                    int e = Math.max(a, b);//结束下标
                    int max = students[s - 1];
                    //计算出 [s-1 , e)范围的最大值
                    for (int  y = s; y < e; y++) {
                        max = Math.max(max, students[y]);
                    }
                    System.out.println(max);
                }
                if (c.equals("U")) {
                    students[a - 1] = b;
                }
            }
        }
    }
}

