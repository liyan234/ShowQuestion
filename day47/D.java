package day47;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class D {

    static class Man{
        int height;
        int weight;

        public Man (int height, int weight) {
            this.height = height;
            this.weight = weight;
        }
    }


    public static void main (String[] args) {

        // 先是体重再是身高
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int x = sc.nextInt();
            Man[] arr = new Man[x];
            for (int i = 0; i < x; i++) {
                int index = sc.nextInt();
                arr[i] = new Man(sc.nextInt(), sc.nextInt());
            }

            Arrays.sort(arr, new Comparator<Man>(){
                @Override
                public int compare(Man m1, Man m2) {
                    int ret = Integer.compare(m1.height, m2.height);
                    if (ret != 0) {
                        return ret;
                    } else {
                        return Integer.compare(m1.weight, m2.weight);
                    }
                }
            });

            int[] dp = new int[x];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < dp.length; i++) {
                dp[i] = 1;
                for (int j = i-1; j >= 0; j--) {
                    if (arr[i].weight  >  arr[j].weight
                            || ( arr[i].weight == arr[j].weight && arr[i].height == arr[j].height ) ) {

                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
                max = Math.max(dp[i], max);
            }
            System.out.println(max);
        }

    }
}
