package day28;

import java.util.Scanner;

public class D2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String password = sc.nextLine();
            if(checkLength(password) && checkKinds(password) && checkRepeat(password)) {
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        }
    }
    public static boolean checkLength(String password) {
        if (password == null || password.length() <= 8) {
            return false;
        }
        return true;
    }
    public static boolean checkKinds(String password) {
        int x = 0;
        int y = 0;
        int z = 0;
        int o = 0;
        char[] chs = password.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] <= '9' && chs[i] >= '0') {
                x = 1;
            } else if (chs[i] <= 'z' && chs[i] >= 'a') {
                y = 1;
            } else if (chs[i] <= 'Z' && chs[i] >= 'A') {
                z = 1;
            } else {
                o = 1;
            }
        }
        int total = x + y + z + o;
        if (total >= 3) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkRepeat(String password) {
        for(int i = 0; i < password.length() - 2; i++) {
            String sub = password.substring(i, i+3);
            if(password.substring(i+1).contains(sub)){
                return false;
            }
        }
        return true;
    }
}
