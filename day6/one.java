package day6;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a_b = sc.nextInt();
            int b_c = sc.nextInt();
            int ab = sc.nextInt();
            int bc = sc.nextInt();

            float b = b_c + bc;
            b = b/2;

            float a = a_b + ab;
            a = a/2;

            float c = bc - b;

            if ((b - ((b_c + bc) / 2)) != 0 || (b - ((ab - a_b) / 2)) != 0) {
                System.out.println("NO");
                return;
            }

            if (a - ((a_b + ab) /2) != 0 ) {
                System.out.println("NO");
                return;
            }

            if (c - ((bc - b_c) / 2) != 0) {
                System.out.println("NO");
                return;
            }

            System.out.print(a + " ");
            System.out.print(b + " ");
            System.out.print(c);
        }
    }
}
