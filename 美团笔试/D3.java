package 美团笔试;

import java.util.ArrayList;
import java.util.Scanner;

public class D3 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String x = sc.next();
            int[] ins = new int[n];
            for (int i = 0; i < n; i++) {
                ins[i] = sc.nextInt();
            }
            int count = 0;
            //获取每一个数的正整数因子
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int j = 1; j < ins[i]/2; j++) {
                    if (ins[i] % j == 0) {
                        list.add(j);
                    }
                }
                list.add(ins[i]);
                if (judge(list, x)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    private static boolean judge(ArrayList<Integer> list, String str) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            buffer.append(String.valueOf(list.get(i)));
        }
        String r = buffer.toString();
        if (r.contains(str)) {
            return true;
        }
        return false;
    }
}
