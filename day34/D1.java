package day34;

import java.util.ArrayList;
import java.util.Scanner;

public class D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String org = sc.next();
        String typed = sc.next();

        ArrayList<Character> list = new ArrayList<>();

        int size = org.length();
        int iorg = 0;
        int itype = 0;

        while (iorg < size) {
            boolean worn = false;
            char ch = org.charAt(iorg);
            char upCh = Character.toUpperCase(ch);

            if (itype >= typed.length()) {
                worn = true;
            } else {
                char ty = typed.charAt(itype);
                char upTy = Character.toUpperCase(ty);
                if (upCh != upTy) {
                    worn = true;
                }
            }

            if (worn) {
                if (!list.contains(upCh)) {
                    list.add(upCh);
                }
                iorg++;
            } else {
                iorg++;
                itype++;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
    }

}
