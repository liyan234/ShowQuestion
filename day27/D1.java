package day27;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int x = sc.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < x; i++) {
                int y = sc.nextInt();
                map.put(y, i);
            }
            int num = sc.nextInt();
            if (map.containsKey(num)) {
                System.out.println(map.get(num));
            } else {
                System.out.println(-1);
            }
        }
    }
}
