package day18;

import java.net.Inet4Address;
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str = sc.nextLine();
            int size = sc.nextInt();
            String max = "";
            double rit = 0;
            //
            for (int i = 0; i < str.length() - size + 1; i++) {
                String xx = str.substring(i, i + size);
                double helpSzie = helpMaxSize(xx);
                if (helpSzie > rit) {
                    max = xx;
                    rit = helpSzie;
                }
            }
            System.out.println(max);
        }

    }

    private static double helpMaxSize(String xx) {
        double ret = 0;
        double count = 0;
        char[] chs = xx.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] == 'C' || chs[i] == 'G') {
                count++;
            }
        }
        ret = count / chs.length;
        return ret;
    }

}
