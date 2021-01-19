package day21;

import java.util.Scanner;

public class D2 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                String s = sc.nextLine();
                char[] chs = s.toCharArray();
                char ch = ' ';
                for (int i = 0; i < chs.length; i++) {
                    if (chs[i] > 'E') {
                        chs[i] -= 5 ;
                    } else if (chs[i] == ' ') {

                        chs[i] = ch;
                    } else {
                        chs[i] += 21;
                    }
                }
                System.out.println(new String(chs));
            }
        }

}
