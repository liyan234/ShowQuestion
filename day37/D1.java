package day37;

import java.util.ArrayList;
import java.util.Scanner;

public class D1 {


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < x; i++) {
                int num = sc.nextInt();
                int y = sc.nextInt();

                if (num == 1) {
                    list.add(y);
                } else {
                    list.remove(y);
                }
                judge(list);
            }
        }
    }

    private static void judge(ArrayList<Integer> list) {
        if (can(list)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean can(ArrayList<Integer> list) {
        int len = list.size();
        if (len == 1 || len == 2) {
            return false;
        }
        for (int i = 0; i < len; i++){
            int sum = 0;
            int temp = list.get(i);
            for (int j = 0; j < len; j++) {

                if (i == j) {
                    continue;
                } else {
                    sum += list.get(j);
                }
            }
            if (sum <= temp) {
                return false;
            }
        }
        return true;
    }
}
