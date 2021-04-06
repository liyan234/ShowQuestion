package 美团2;

import java.util.Arrays;
import java.util.Scanner;

public class D1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0;i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            // 人数小于2*x
            // 人数大于2*y
            if( n < 2*x || n > 2*y){
                System.out.println(-1);
                return;
            }

            //二分淘汰人数
            int left = x;
            int right = y+1;
            while(left < right){
                //
                int mid = left+(right-left)/2;
                if(n-mid >=x || n-mid <=y){
                    right =mid;
                }else{
                    left =mid+1;
                }
            }
            System.out.println(arr[left-1]);

        }
    }

}
