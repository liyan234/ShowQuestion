package day38;

import java.util.Scanner;

public class D2 {
    static int n, m, k;
    static int[][] map;

    static double u = 0;
    static double s = 0;


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            n = sc.nextInt();
            m = sc.nextInt();
            k = sc.nextInt();

            map = new int[n + 1][m + 1];
            for (int i = 0; i < k; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                map[x][y] = 1;
            }
            dfs1(1, 1);
            dfs2(1, 1);
            double ret = u /s ;
            System.out.println(ret);
        }
    }

    public static boolean in (int a, int b) {
        if (a < 1 || b < 1 || a >= n || b >= m) {
            return false;
        }
        return true;
    }
    public static void dfs1(int x, int y){
        if (in(x + 1, y) && map[x + 1][y] == 1) {
            u++;
            return;
        } else {
            dfs1(x +1, y);
        }

        if (in(x, y+1) && map[x][y +1] == 1) {
            u++;
            return;
        } else {
            dfs1(x, y+1);
        }

    }
    public static void dfs2(int x, int y){
        if (in(x + 1, y) && x+1 == n && y == m) {
            s++;
            return;
        } else {
            dfs2(x + 1, y);
        }

        if (in(x , y + 1) && x == n && y+1 == m) {
            s++;
            return;
        } else {
            dfs2(x , y +1);
        }


    }

}
