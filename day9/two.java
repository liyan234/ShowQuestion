package day9;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] strs = str.split("");
            String ret = new String();
            for(int i = strs.length - 1; i >= 0; i--) {
                ret = ret + strs[i];
            }
            System.out.println(ret);
        }
    }
}
