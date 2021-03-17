package day44;

import java.util.Scanner;

public class D1 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            char[] chs = str.toCharArray();
            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < chs.length; i++) {
                if (chs[i] == '_') {
                    i++;
                    char ch = (char) (chs[i] - 32);
                    sb.append(ch);
                } else {
                    sb.append(chs[i]);
                }
            }
            System.out.println(sb.toString());

        }

    }
}
