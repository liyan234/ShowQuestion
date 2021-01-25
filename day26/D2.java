package day26;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            Map<String, Integer> map = new HashMap<>();
            int x = sc.nextInt();
            String[] xStr = new String[x];
            for (int i = 0; i < x; i++) {
                String strX = sc.next();
                map.put(strX, 0);
                xStr[i] = strX;
            }

            int y = sc.nextInt();
            int count = 0;
            for (int i = 0; i < y; i++) {
                String strY = sc.next();
                if (map.containsKey(strY)) {
                    map.put(strY, map.get(strY) + 1);
                } else  {
                    count++;
                }
            }
            for (String k : xStr) {
                System.out.println(k + " : " + map.get(k));
            }
            System.out.println("Invalid" + " : " + count);
        }
    }
}
