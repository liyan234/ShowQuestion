package day46;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class D2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new LinkedHashMap<>();
        while (sc.hasNext()) {
            String str = sc.next();
            int num = sc.nextInt();
            String[] strs = str.split("////");
            String name = strs[strs.length  - 1];
            if (name.length() > 16) {
                name = name.substring(name.length() - 16);
            }

            String key = name + " " + num;
            int value = 1;
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, value);
            }
        }
        int count = 0;
        for (String s : map.keySet()) {
            count ++;
            if (count > (map.keySet().size() - 8)) {
                System.out.println(s + " " + map.get(s));
            }
        }
    }

}
