package day4;


import java.util.Scanner;


public class two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();

            String ret = helpDelete(str1, str2);
            System.out.println(ret);
        }
    }

    private static String helpDelete(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        char[] xx = new char[str1.length()];

        for (int i = 0; i < str1.length(); i++) {
            xx[i] = str1.charAt(i);
        }

        for (int i = 0; i < xx.length; i++) {
            if ( !str2.contains(String.valueOf(xx[i])) ) {
                sb.append(xx[i]);
            }
        }
        return String.valueOf(sb);
    }
}
