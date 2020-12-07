package day14;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            String strs = GetSequeOddNum(m);
            System.out.println(strs);
        }
    }
    private static String GetSequeOddNum(int m) {
        StringBuffer sb = new StringBuffer();
        Long first = Long.valueOf((m*m) - (m - 1));
        sb.append(first);
        for (int i = 1; i < m; i++) {
            first = first + 2;
            sb.append("+");
            sb.append(first);
        }
        return String.valueOf(sb);
    }
}
