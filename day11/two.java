package day11;

public class two {

    public int[] multiply(int[] A) {
        int len = A.length;
        int[] nums = new int[len];
        if(len != 0) {
            // 先计算前面的 就是大于i的
            nums[0] = 1;
            for(int i = 1; i < len; i++) {
                // 从低位到高位
                nums[i] = nums[i - 1] * A[i - 1];
            }
            // 需要设置一个变量
            // 从高位到低位
            int tmp = 1;
            for(int i = len - 2; i >= 0; i--) {
                tmp = tmp * A[i + 1];
                nums[i] = tmp * nums[i];
            }
        }
        return nums;
    }
}
