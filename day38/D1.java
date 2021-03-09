package day38;


import java.util.Scanner;

public class D1 {


    static int m, n;
    static String[][] arrays;
    static boolean[][] bool;
    static int si, sj;
    static int sum = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            m = sc.nextInt();
            n = sc.nextInt();


            arrays = new String[m][n];
            bool = new boolean[m][n];
            // 将 符号输入到里面
            for (int i = 0; i < m; i++) {

                String str = sc.next();
                String[] strs = str.split("");
                //System.out.println(strs.length);
                for (int j = 0; j < n; j++) {
                    arrays[i][j] = strs[j];
                    if ("@".equals(arrays[i][j])) {
                        si = i;
                        sj = j;
                    }
                }
            }
            /*for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arrays[i][j]);
                }
                System.out.println();
            }*/
            dfs(si, sj);

            System.out.println(sum);

        }
    }

    public static boolean in(int si, int sj) {
        if (si < 0 || sj < 0 || si >= m || sj >= n) {
            return false;
        }
        return true;
    }

    public static void dfs(int si, int sj) {

        if (in(si+1, sj) && arrays[si + 1][sj].equals(".") && !bool[si + 1][sj]) {
            sum++;
            bool[si + 1][sj] = true;
            dfs(si + 1, sj);
        }
        if (in(si-1, sj) && arrays[si - 1][sj].equals(".") && !bool[si - 1][sj]) {
            sum++;
            bool[si - 1][sj] = true;
            dfs(si - 1, sj);
        }
        if (in(si, sj+1) && arrays[si][sj + 1].equals(".") && !bool[si][sj + 1]) {
            sum++;
            bool[si][sj + 1] = true;
            dfs(si, sj + 1);
        }
        if (in(si, sj-1) && arrays[si][sj - 1].equals(".") && !bool[si][sj - 1]) {
            sum++;
            bool[si][sj - 1] = true;
            dfs(si, sj - 1);
        }
    }



}
