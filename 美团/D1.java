package 美团;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class D1 {
    //  最多烤n个 蛋糕
    //  做好了m个 蛋糕
    //  顾客买个两个蛋糕,  最重和最轻的蛋糕  a和b
    //  n m a b
    //  m个数, 最大的和最小

    /**
     * 4 2 2 4
     * 3 3
     * 4 2 2 4
     * 1 1
     * 4 2 2 4
     * 5 5
     * 4 2 4 2
     * 2 4
     * 2 2 2 4
     * 3 3
     * 3 2 2 4
     * 3 3
     * 3 2 2 4
     * 3 3
     * */

    /**
     * YES
     * NO
     * NO
     * YES
     * NO
     * NO
     * NO
     * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int[] arr = new int[m];
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                arr[i] = sc.nextInt();
                list.add(arr[i]);
            }
            Arrays.sort(arr);

            if (a > b) {
                int tmp = a;
                a = b;
                b = tmp;
            }

            if(arr[0] < a || arr[m - 1] > b){
                // 现有蛋糕中，重量最小的小于a，最大的大于b，肯定完成不了需求
                System.out.println("NO");
            }else{
                if(list.contains(a) && list.contains(b))   // 如果现有蛋糕中已经包含了a和b，就没问题
                {
                    System.out.println("YES");
                } else{
                    if(list.contains(a) || list.contains(b)){
                        // 如果只包含a或b，检查一下n-m是否大于等于1，即还有一个重量需要现烤
                        System.out.println(n - m >= 1 && arr[m - 1] <= b? "YES": "NO");
                    }else{
                        // 否则需要检查n-m是否大于等于2，即两个重量都需要现烤
                        System.out.println(n - m >= 2? "YES": "NO");
                    }
                }
            }

        }
    }

}
