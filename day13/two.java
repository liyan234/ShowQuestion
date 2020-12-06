package day13;

import java.math.BigInteger;
import java.util.Scanner;

public class two {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str1 = sc.next();
            String str2 = sc.next();
            System.out.println(AddLongInteger(str1, str2));
        }
    }
    public static String AddLongInteger(String addend, String augend) {
        BigInteger num1 = new BigInteger(addend);
        BigInteger num2 = new BigInteger(augend);
        return String.valueOf(num1.add(num2));
    }
}
