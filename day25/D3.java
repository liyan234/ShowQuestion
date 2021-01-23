package day25;

public class D3 {

    public int[] sortArrayByParity(int[] A) {
        int x = 0;
        int y = A.length - 1;

        while (x < y) {
            while (y > 0 && A[y] % 2 == 1) {
                y--;
            }
            while (x < A.length && A[x] % 2 == 0) {
                x++;
            }
            if (x < y) {
                swap(A, x , y);
            }
        }
        return A;
    }
    public void swap(int[] nums, int x, int y) {
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }

   
}

