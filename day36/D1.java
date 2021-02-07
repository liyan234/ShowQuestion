package day36;

import java.util.Scanner;

public class D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str = sc.nextLine();
            int[] chs = new int[26];
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    chs[c - 'A']++;
                }
            }
            for (int i = 0; i < chs.length; i++) {
                char x = (char)('A' + i);
                System.out.println(('A' + i) + ":" + chs[i]);
            }
        }
    }
}
