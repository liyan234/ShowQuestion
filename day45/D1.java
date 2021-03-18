package day45;

import java.util.Scanner;

public class D1 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String A = sc.next();
            String B = sc.next();
            int[] a = new int[26];

            for (int i = 0; i < A.length(); i++) {
                int x =(char)( A.charAt(i) - 'A');
                a[x]++;
            }
            for (int i = 0; i < B.length(); i++) {
                int x = (char) (B.charAt(i) - 'A');
                a[x]--;
            }
            boolean bool = false;
            for (int i = 0; i < 26; i++) {
                if (a[i] < 0) {
                    bool = true;
                }
            }
            if (bool) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }

    }

}
