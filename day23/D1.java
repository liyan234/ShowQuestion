package day23;

import java.util.Scanner;

public class D1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int[] nums = new int[N];
            int A1 = 0;
            int A2 = 0;
            int flag = 1;
            int A3 = 0;
            int A4 = 0;
            int count = 0;
            int A5 = 0;

            for (int i = 0; i < N; i++) {
                nums[i] = sc.nextInt();

                if (nums[i] % 5 == 0) {
                    if (nums[i] % 2 == 0) {
                        A1 = A1 + nums[i];
                    }
                }

                if (nums[i] % 5 == 1) {
                    A2 += flag * nums[i];
                    flag = -flag;
                }

                if (nums[i] % 5 == 2) {
                    A3++;
                }

                if (nums[i] % 5 == 3) {
                    A4 = A4 + nums[i];
                    count++;
                }

                if (nums[i] % 5 == 4) {
                    if (nums[i] > A5) {
                        A5 = nums[i];
                    }
                }
            }

            if (A1 != 0) {
                System.out.print(A1 + " ");
            } else{
                System.out.print('N' + " ");
            }

            if (A2 != 0) {
                System.out.print(A2 + " ");
            } else{
                System.out.print('N' + " ");
            }

            if (A3 != 0) {
                System.out.print(A3 + " ");
            } else{
                System.out.print('N' + " ");
            }

            int x = (( (A4 % count * 100) / count) + 5) / 10;
            if (A4 != 0) {
                System.out.print( A4/count + "." + x + " ");
            } else{
                System.out.print('N' + " ");
            }

            if (A5 != 0) {
                System.out.print(A5);
            } else{
                System.out.print('N');
            }

        }
    }
}
