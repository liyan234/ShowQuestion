package 美团笔试;

import java.util.ArrayList;
import java.util.Scanner;

public class D4 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            // 找到1的地点
            // 起始地点不同 ，得到的总花费就一样
            int sum = helpFind (arr, n, k);
            System.out.println(sum);
        }
    }
    public static int helpFind(int[][] arr, int n, int k) {
        // 先找到一， 但是可能有多个1 其他数也同样如此
        // 但是必须从1开始 才可以遍历

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (arr[i][j] == 1) {
//
//                }
//            }
//        }
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                list.add(arr[i][j]);
            }
        }
        for (int i = 1; i <= k; i++) {
            if (!list.contains(i)) {
                return -1;
            }
        }
        return 1;
    }
}
