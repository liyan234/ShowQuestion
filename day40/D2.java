package day40;

import java.util.Scanner;

public class D2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();

            String[] strs = str.split(" ");
            for (int i = strs.length - 1; i >= 0; i--) {
                System.out.print(strs[i]);
                if (i != 0) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
