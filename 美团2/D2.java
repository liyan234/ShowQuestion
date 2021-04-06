package 美团2;

import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class D2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            int[] arr = new int[n];
            for (int i = 0; i  < arr.length; i++) {
                arr[i] = sc.nextInt();
                list.add(arr[i]);
            }
            int count = 0;


            while(arr[0] < 1){
                arr[0]++;
                count++;
            }
            for(int i = 1; i < n; i++){
                while(arr[i] <= arr[i-1]){
                    arr[i]++;
                    count++;
                }
            }

           /* for (int i = 0 ; i < arr.length; i++) {
                if (arr[i] < 1) {
                    while (arr[i] < 1 || list.contains(arr[i])) {
                        arr[i]++;
                        count++;
                    }
                    list.add(arr[i]);
                } else if (arr[i] > n) {
                    while (arr[i] > n || list.contains(arr[i])) {
                        arr[i]--;
                        count++;
                    }
                    list.add(arr[i]);
                }
            }*/
            System.out.println(count);
        }
    }
}
