package day36;

import java.util.Scanner;

public class D2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            long n = 0;
            for (int i = 2; i < str.length(); i++) {
                n *= 16;
                char ch = str.charAt(i);
                int x = 0;
                if (ch >= 'A' && ch <= 'F') {
                    x = ch - 'A' + 10;
                } else if ( ch >= 'a' && ch <= 'f') {
                    x = ch - 'a' + 10;
                } else {
                    x = ch - '0';
                }
                n += x;
            }
            System.out.println(n);
        }
    }
}
