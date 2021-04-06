package 美团;

import java.util.Scanner;

public class D3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();

            for (int i = 0; i < x ; i++) {
                int n = sc.nextInt();
                int nums[] = new int[n];
                int sum = 0;
                for (int q = 0; q < n; q++) {
                    nums[q] = sc.nextInt();
                    sum += nums[q];
                }
                int max = nums[0];
                int min = nums[0];

                int dpMax = nums[0];
                int dpMin = nums[0];
                for (int k = 1; k < n; k++) {
                    dpMax = Math.max(dpMax + nums[k], nums[k]);
                    max = Math.max(max, dpMax);
                    dpMin = Math.min(dpMin + nums[k], nums[k]);
                    min = Math.min(dpMin, min);
                }
                System.out.println(Math.max(sum - min, max));
            }
        }
    }


}
