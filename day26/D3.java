package day26;

public class D3 {
    public int thirdMax(int[] nums) {
        if (nums.length == 1 ) {
            return nums[0];
        }
        if (nums.length == 2) {
            if (nums[0] > nums[1]) {
                return nums[0];
            } else {
                return nums[1];
            }
        }
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int n : nums) {
            if (n > first) {
                third = second;
                second = first;
                first = n;
            } else if( n == first) {
                continue;
            } else if (n > second) {
                third = second;
                second = n;
            } else if (n == second) {
                 continue;
            } else if (n > third) {
                third = n;
            } else {
                continue;
            }
        }
        if (third == Long.MIN_VALUE) {
            return (int)first;
        } else {
            return (int)third;
        }
    }
}
