package 携程;

import java.util.ArrayList;
import java.util.Scanner;

public class D2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            int n = Integer.valueOf(s);
            String pa = sc.nextLine();

            String[] pas = pa.split(" ");
            //第二行
            ArrayList<ArrayList<Integer>> pack = new ArrayList<>();
            for (int i = 0; i < pas.length; i++) {
                String x = pas[i];
                String[] xs = x.split(",");
                ArrayList<Integer> list = new ArrayList<>();
                for (int j = 0; j < xs.length; j++) {
                    list.add(Integer.valueOf(xs[j]));
                }
                pack.add(list);
            }

            // 第三行
            String p = sc.nextLine();
            String[] ps = p.split(" ");
            int[] price = new int[ps.length];
            for (int i = 0; i < ps.length; i++) {
                price[i] = Integer.valueOf(ps[i]);
            }
            // 第四行,需要用户覆盖掉的权益
            String v = sc.nextLine();
            String[] vs = v.split(" ");
            int[] values = new int[vs.length];
            for (int i = 0; i < vs.length; i++) {
                values[i] = Integer.valueOf(vs[i]);
            }

            int minPrice = acquirePrice(n, pack, price, values);

        }
    }

    private static int acquirePrice(int n, ArrayList<ArrayList<Integer>> pack, int[] price, int[] values) {
        // n为有几个权益
        // pack 有几个包裹
        // price 对应的价格
        // values 需要覆盖掉的权益
        int[][] dp = new int[pack.size()][pack.size()];
        for (int i = 0; i < pack.size(); i++) {
            ArrayList<Integer> list = pack.get(i);
            for (int j = 0; j < list.size(); j++) {
                // 遍历看看每一个权限包裹中是否有这个权限
            }
        }
        return 0;
    }
}
