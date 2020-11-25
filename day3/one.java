package day3;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();

            String ret = judgeLong(str);
            System.out.println(ret);
        }

    }

    private static String judgeLong(String str) {
        int max = 0;
        int count = 0;
        int end = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                count++;
                if (max < count) {
                    max = count;
                    end = i;
                }
            }else {
                count = 0;
            }
        }
        return str.substring(end - max + 1, end + 1);
    }
}
