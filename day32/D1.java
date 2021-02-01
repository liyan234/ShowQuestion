package day32;

import java.util.Scanner;

public class D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str1 = sc.next().split("\\.");
        String[] str2 = sc.next().split("\\.");

        long[] l1 = {
                Long.parseLong(str1[0]),
                Long.parseLong(str1[1]),
                Long.parseLong(str1[2]),
        };
        long[] l2 ={
                Long.parseLong(str2[0]),
                Long.parseLong(str2[1]),
                Long.parseLong(str2[2]),
        };

        long p1 = toKunt(l1[0], l1[1], l1[2]);
        long p2 = toKunt(l2[0], l2[1], l2[2]);

        long c1 = p2 - p1;

        if (c1 < 0) {
            System.out.print("-");
            c1 = -c1;
        }
        System.out.format("%d.%d.%d\n", c1/(17 * 29),(c1%(17*29))/29,(c1%(17*29))%29);
    }

    public static long toKunt(long x1, long x2, long x3) {
        return x1*29*17 + x2*29 + x3;
    }
}
