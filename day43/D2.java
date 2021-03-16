package day43;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class D2 {

    //输出为字典顺序 并且不重复
    public static void main (String[] args) {
         String symbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
         String ret =    "222333444555666777788899991234567890";

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int x = sc.nextInt();

            ArrayList<String> arr = new ArrayList<String>();
            for (int i = 0 ; i < x; i++) {
                String s = sc.next();
                StringBuilder sb = new StringBuilder();

                s = s.replaceAll("-" , "");
                for (int j = 0; j < 3; j++) {
                    sb.append(ret.charAt(symbol.indexOf(s.charAt(j) + "")));

                }
                sb.append("-");
                for (int j = 3; j < 7; j++) {

                    sb.append(ret.charAt(symbol.indexOf(s.charAt(j) + "")));
                }

                if (!arr.contains(String.valueOf(sb))) {
                    System.out.println(sb);
                    arr.add(String.valueOf(sb));
                }

            }
            Collections.sort(arr);
            for (int a = 0; a < arr.size(); a++) {
                System.out.println(arr.get(a));
            }
            System.out.println();
        }
    }
}
