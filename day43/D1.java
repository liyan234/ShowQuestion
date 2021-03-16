package day43;

import java.util.ArrayList;
import java.util.Scanner;

public class D1 {
    public static ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    public static ArrayList<Integer> list = new ArrayList<Integer>();

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            // 深度遍历
            dfs(1, m ,n);

            for (ArrayList<Integer> arr : res) {
                int i = 0;
                for (; i < arr.size() - 1; i++) {
                    System.out.print(arr.get(i) + " ");
                }
                System.out.println(arr.get(i));
            }
        }

    }

    public static void dfs(int index, int m, int n) {
        if (m == 0) {
            res.add(new ArrayList<>(list));
        } else {
            for (int i = index; i <= m && i <= n; i++) {
                list.add(i);
                dfs(i + 1, m - i, n);
                list.remove(list.size()-1);
            }
        }
    }


}
