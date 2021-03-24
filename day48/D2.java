package day48;

public class D2 {

    public static void main(String[] args) {
        int[][] x = {{1,2}, {3,4}};
        int[] ret = clockwisePrint(x, 2, 2);
        System.out.println(ret);
    }


    public static int[] clockwisePrint(int[][] mat, int n, int m) {
        int[] rets = new int[m*n];
        if (mat == null) {
            return rets;
        }
        int i = 0;
        int j = 0;
        int k = 0;

        int startx = 0;
        int starty = 0;
        int endx = n - 1;
        int endy = m - 1;

        while(startx <= endx && starty <= endy) {
            if(startx == endx) {
                for (; j <= endy; j++,k++) {
                    rets[k] = mat[startx][j];
                }
                return rets;
            }
            if (starty == endy) {
                for (; i <= endx; i++,k++) {
                    rets[k] = mat[i][starty];
                }
                return rets;
            }

            //第一行
            for (; j < endy; j++,k++) {
                rets[k] = mat[i][j];
            }
            //最后一列
            for (; i < endx; i++,k++) {
                rets[k] = mat[i][j];
            }
            for (; j > startx; j--,k++) {
                rets[k] = mat[i][j];
            }
            for (; i < starty; i--,k++) {
                rets[k] = mat[i][j];
            }
            i++;
            j++;

            startx++;
            starty++;
            endx--;
            endy--;
        }
        return rets;
    }
}
