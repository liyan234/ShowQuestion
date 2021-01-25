package day26;

import java.util.Scanner;

public class D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int x = sc.nextInt();
            int y = getSum(x);
            int z = getSum(x * x);
            System.out.println(y + " " + z);
        }
    }
    public static int getSum(int x) {
        int count = 0;
        while (x != 0) {
            count += (x % 10);
            x = x/10;
        }
        return count;
    }
}
