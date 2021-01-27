package day28;

import java.util.Scanner;

public class D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int x = sc.nextInt();
            int y = x * x;

            String s1 = String.valueOf(x);
            String s2 = String.valueOf(y);
            String s = s2.substring(s2.length() - s1.length(), s2.length());
            if(s.equals(s1)) {
                System.out.println("Yes!");
            } else {
                System.out.println("No!");
            }
        }
    }
}
