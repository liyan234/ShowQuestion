package day48;

public class D1 {

    public int findMaxGap(int[] A, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        // 左右两边随便取一个最大值
        // 绝对值的话就不考虑是负数了
        int left = max - A[0];
        int right = max - A[n-1];
        if (left > right) {
            return left;
        } else {
            return right;
        }

    }
}
