package 网易;

public class D3 {
    public static int maxWater (int[] height) {
        int left = 0;

        int count = 0;
        for (int i = 1; i < height.length; i++) {
            if (height[left] > height[i]) {
                count += height[left] - height[i];
            } else {
                left = i;

            }
        }
        int x = height.length - 1;
        if (height[x] < height[left]) {
            for (int i = x; i > left; i--) {
                count -= height[left] - height[x];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 3, 0, 5, 0, 1};
        int x = maxWater(arr);
    }
}
