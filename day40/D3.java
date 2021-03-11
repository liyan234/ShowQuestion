package day40;

import java.util.Scanner;

// 单词逆置
public class D3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(resversSet(str));
        }
    }

    // 句子逆置
    private static String resversSet(String str) {
        if(str == null) {
            return null;
        }
        //可以整体先进行逆置
        char[] ch = str.toCharArray();
        reverse(ch, 0, ch.length-1);

        // 整体逆置完之后， 我们需要开始部分逆置
        int x = 0;
        int y = 0;
        while ( x < ch.length) {
            // 当碰到' '的时候
            if (ch[x] == ' ') {
                x++;
                y++;
            } else if ( y == ch.length || ch[y] == ' ') {
                //部分逆置的
                // 这个时候 我们发现 y 在 ' '的位置 所以我们需要
                y--;
                reverse(ch, x, y);
                // 部分逆置之后 我们需要跳转到下一个单词
                y++;
                x = y;
            } else {
                //直到 ch[y] == ' '
                y++;
            }
        }
        return  String.copyValueOf(ch);
    }

    private static void reverse(char[] ch, int start, int end) {
        while (start < end)  {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start ++;
            end--;
        }
    }

}
