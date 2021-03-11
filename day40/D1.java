package day40;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class D1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String pr1 = sc.nextLine();
            String str1 = sc.nextLine();
            String ret = DeletSame(pr1, str1);
            System.out.println(ret);
        }
    }

    private static String DeletSame(String pr1, String str1) {
        if (pr1 == null || str1 == null) {
            return  pr1;
        }
        // 字符最多右256个 我们设置
        boolean[] table = new boolean[256];
        int lenstr1 = str1.length();
        int i = 0;
        // 都有啥字符 把对应的字符设为true
        while (i < lenstr1) {
            int index = str1.charAt(i);

            table[index] = true;
            i++;
        }
        char[] prs1 = pr1.toCharArray();
        int a = 0;
        int b = 0;
        // 遍历pr1, 没有出现的字符，覆盖掉出现的字符
        while (a < prs1.length) {
            int index = prs1[a];
            // 看看 table 中是否有这个数
            // 有的话 则是要删除的字符
            // 我们就将其覆盖掉
            // 出现过的字符我们在第一次遍历的时候就将其设为 true
            if (!table[index]) {
                prs1[b] = prs1[a];
                //b最终就成了新的长度
                b++;
            }
            a++;
        }
        prs1 = Arrays.copyOf(prs1, b);
        return String.copyValueOf(prs1);
    }
}
