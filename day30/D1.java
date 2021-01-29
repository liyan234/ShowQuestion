package day30;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D1 {
    public  static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            Map<Integer, String> map = new HashMap<Integer, String>();
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                int len = s.length();
                map.put(len, s);
                nums[i] = len;
            }
            Arrays.sort(nums);
            for(int i = 0; i < n; i++) {
                System.out.println(map.get(nums[i]));
            }
        }
    }

}
