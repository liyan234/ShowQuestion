package day24;

public class D3 {

    public static void main(String[] args) {
        int[] x = {-7,-3,2,3,11};
        sortedSquares(x);

        for(int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int len = nums.length;
        // 使用归并排序来解决
        int x1 = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                x1++;
            } else {
                break;
            }
        }
        int nums1[] = new int[x1];
        // 负数 降序
        for (int i = 0; i < x1; i++) {
            nums1[i] = nums[i] * nums[i];
        }

        int nums2[] = new int[len - x1];
        int x2 = x1 ;
        // 正数 升序
        for(int i = 0; i < len - x1; i++) {
            nums2[i] = nums[x2] * nums[x2];
            x2++;
        }

        int h1 = x1 - 1;
        int h2 = 0;

        int y = 0;

        while ( (h1 >= 0) && (h2 < len - x1) && (y < len)) {
            if (nums1[h1] < nums2[h2]) {
                nums[y] = nums1[h1];
                y++;
                h1--;
            } else {
                nums[y] = nums2[h2];
                h2++;
                y++;
            }
        }
        if (h1 < 0) {
            while ( h2 < len - x1 && y < len ) {
                nums[y] = nums2[h2];
                h2++;
                y++;
            }
        } else {
            while ( h1>= 0 && y < len ) {
                nums[y] = nums1[h1];
                h1--;
                y++;
            }
        }
        return nums;
    }
}
