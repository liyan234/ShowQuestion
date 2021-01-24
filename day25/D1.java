package day25;

import java.util.Scanner;

public class D1 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int nums[] = new int[n];
            int score[] = new int[n];

            for (int i = 0; i < n; i++) {
                score[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            double count = 0.0;
            for (int i = 0; i < n; i++) {
                if (nums[i] >=  90 && nums[i] <= 100)  {
                    count += 4.0 * score[i];
                }
                if (nums[i] >=  85 && nums[i] <= 89)  {
                    count += 3.7 * score[i];
                }
                if (nums[i] >=  82 && nums[i] <= 84)  {
                    count += 3.3 * score[i];
                }
                if (nums[i] >=  78 && nums[i] <= 81)  {
                    count += 3.0 * score[i];
                }
                if (nums[i] >=  75 && nums[i] <= 77)  {
                    count += 2.7 * score[i];
                }
                if (nums[i] >=  72 && nums[i] <= 74)  {
                    count += 2.3 * score[i];
                }
                if (nums[i] >=  68 && nums[i] <= 71)  {
                    count += 2.0 * score[i];
                }
                if (nums[i] >=  64 && nums[i] <= 67)  {
                    count += 1.5 * score[i];
                }
                if (nums[i] >=  60 && nums[i] <= 63)  {
                    count += 1.0 * score[i];
                }
                if (nums[i] < 60) {
                    count += 0 * score[i];
                }
            }
            double  s = 0.0;
            for (int i = 0; i < n; i++) {
                s += score[i];
            }
            double y = (double)count / s;
            System.out.printf("%.2f", y);
        }
    }
}
