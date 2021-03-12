package day41;

import java.util.Scanner;

public class D2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] ss = str.split(";");
            walkPoint(ss);
        }

    }
    public static void walkPoint(String[] ss) {
        int i = 0;
        int j = 0;
        for (int b = 0; b < ss.length; b++) {
            if (judge(ss[b])) {
                char x = ss[b].charAt(0);
                int num = Integer.valueOf(ss[b].substring(1));
                if (x == 'A') {
                    i = i - num;
                }
                if (x == 'S') {
                    j = j - num;
                }
                if (x == 'W') {
                    j = j + num;
                }
                if (x == 'D') {
                    i = i + num;
                }
            }
        }
        System.out.println(i + "," + j);

    }

    public static boolean judge(String str) {
        if (str.trim().length() < 2 || str.trim() == null || str.trim().equals("")) {
            return false;
        }
        if (str.charAt(0) != 'A' && str.charAt(0) != 'S' &&
                str.charAt(0) != 'W' && str.charAt(0) != 'D') {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            char x = str.charAt(i);
            if ( x > '9' ||  x < '0') {
                return false;
            }
        }
        return true;
    }
}
