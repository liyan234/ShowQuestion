package day13;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int x = sc.nextInt();
            String ch = sc.next();
            for(int i = 0; i < x ; i++) {
                System.out.print(ch);
            }
            System.out.println();
            float y = (float) (x / 2.0);

            for(int i = 0; i < y - 2; i++) {

                System.out.print(ch);
                for(int j = 0; j < x-2; j++) {
                    System.out.print(" ");
                }
                System.out.print(ch);
                System.out.println();
            }

            for(int i = 0; i < x ; i++) {
                System.out.print(ch);
            }
        }
    }
}
