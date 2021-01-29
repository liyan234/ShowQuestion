package day30;

import java.util.Scanner;

public class D2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            // 我们在方法中直接进行输出 str长度大于1的时候会输出多个八进制
            helpChange(str.toCharArray());
        }
    }
    private static void helpChange(char[] chs) {
        int[] ret = new int[8];
        for (int i = 0; i < chs.length; i++) {
            // 进行校验的位置
            int count = 0;
            int x = 1;
            int j = 7;
            while ( j  > 0) {
                if ( (chs[i] & x) == 0) {
                    ret[j] = 0;
                } else{
                    ret[j] = 1;
                    count++;
                }
                x <<= 1;
                j--;
            }
            if (count % 2 == 0) {
                ret[0] = 1;
            }
            for (int k = 0; k < ret.length; k++) {
                System.out.print(ret[k]);
            }
            ret[0] = 0;
            System.out.println();
        }
    }
}
