package day11;

import java.util.*;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] strs = str.split("");
            int[] ins = new int[strs.length];
            for(int i = 0; i < strs.length; i++) {
                ins[i] = Integer.valueOf(strs[i]);
            }
            // 0 ~ 9 
            // 用一个链表表示0 ~ 9
            // 每个位置初始化为0
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < 10; i++ ) {
                list.add(0);
            }
            // 是那个位置 就 + 1
            for(int i = 0; i < ins.length; i++) {
                list.set(ins[i], list.get(ins[i]) + 1);
            }
            for(int i = 0; i < list.size(); i++) {
                if(list.get(i) > 0) {
                    System.out.println(i + ":" + list.get(i));
                }
            }

        }
    }
}