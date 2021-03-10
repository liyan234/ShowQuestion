package day39;

import java.util.Scanner;

public class D2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            boolean flag = false;
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                String newStr = str.substring(0,i) + str.substring(i+1);
                if (ishuiwen(newStr)) {
                    flag = true;
                }
            }
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    public static boolean ishuiwen(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
