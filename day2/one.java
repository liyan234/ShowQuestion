package day2;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int x = sc.nextInt();
            if (x == 0) {
                return;
            }

            int drink = helpDrink(x);

            System.out.println(drink);
        }
    }

    private static int helpDrink(int x) {
        int sum = 0;
        int bottle = 3;

        while (x >= bottle) {
            int dr = x / bottle; // 10/3 = 3
            sum = sum + dr; // sum = 3
            x = x % 3;   // x = 1
            x = x + dr; // x = 3 + 1
        }
        if (x == 2) {
            sum++;
        }

        return sum;
    }
}
