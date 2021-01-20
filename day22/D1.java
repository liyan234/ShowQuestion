package day22;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String store = sc.nextLine();
            String man = sc.nextLine();
            // 利用map来存储珠子的数量和种类
            Map<Character, Integer> s = new HashMap<>();
            for (Character c : store.toCharArray()) {
                if (s.containsKey(c)) {
                    s.put(c, s.get(c) + 1);
                } else {
                    s.put(c, 1);
                }
            }
            //同理 存储
            Map <Character, Integer> m = new HashMap<>();
            for (Character c : man.toCharArray()) {
                if (m.containsKey(c)) {
                    m.put(c, m.get(c) + 1);
                } else {
                    m.put(c, 1);
                }
            }
            //定于是否缺少
            boolean temp = false;
            // 缺少
            int lack = 0;

            //遍历 man 看store中是否包含
            for (Map.Entry<Character, Integer> x : m.entrySet()) {
                // 珠子
                char ch = x.getKey();
                // 需要的数量
                int num = x.getValue();
                if (!s.containsKey(ch)) {
                    lack ++;
                    temp = true;
                }
                if (s.containsKey(ch) && s.get(ch) < num) {
                    lack ++;
                    temp = true;
                }
            }
            if (temp) {
                System.out.println("No" + " " + lack);
            } else {
                System.out.println("Yes" + " " + (store.length() - man.length()) );
            }
        }
    }
}
