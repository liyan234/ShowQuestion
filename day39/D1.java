package day39;

public class D1 {
    public int[] arrayPrint(int[][] arr, int n) {
        // write code here

        int[] arrays = new int[n * n];

        // 右上半部分
        int u = 0;
        int x = 0;
        for (int y = n-1; y >= 0; y--) {
            int x1 = x; // x 周一直从0开始
            int y1 = y;

            if (x1 != 0 && y1 != 0) {
                arrays[u++] = arr[x1][y1];
            }
            if (x1 != 0) {
                y1--;
            }

            while (x1 < n && (y1 >= 0 && y1 < n)) {
                arrays[u++] = arr[x1++][y1++];
            }
        }

        int b = 0;
        for (int a = 1; a < n; a++){
            int x2 = a; //
            int y2 = b; // y轴一直从0开始
            arrays[u++] = arr[x2++][y2++];
            while (y2 < n && (x2 >=0 && x2 < n)) {
                arrays[u++] = arr[x2++][y2++];
            }
        }
        return arrays;
    }
}
