package day31;

import java.util.*;

public class D2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        // 先输出
        while (sc.hasNext()) {
            String pa = sc.next();
            // 分开
            // 获取到最后一个 \ 号的位置
            int id = pa.lastIndexOf('\\');
            String name = "";
            if (id == -1) {
                name = pa;
            } else {
                name = pa.substring(id + 1);
            }
            int line = sc.nextInt();

            String key = name + " " + line;
            // key 为名字+行号  value 为频率
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        // 根据 value进行排序
        // 1. 先将map中的内容保存到list中
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return b.getValue() - a.getValue();
            }
        });
        int k = 0;
        for (Map.Entry<String, Integer> m : list) {
            if (k > 7) {
                break;
            }

            String[] s = m.getKey().split(" ");
            String n = s[0];
            if (n.length() > 16) {
                n = n.substring(n.length() - 16);
            }
            String x = s[1];
            Integer c = m.getValue();
            System.out.println(n + " " + x + " " + c);
            k++;
        }
    }
}
