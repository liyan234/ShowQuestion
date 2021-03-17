package day44;

import java.util.Scanner;

public class D2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str = sc.nextLine();
            /*char[] chs = str.toCharArray();
            // 反转整个句子
            reverse(chs, 0 , chs.length-1);
            int left = 0;
            int right = 0;
            for (int i = 0; i < chs.length; i++) {
                if (chs[i] <= 'Z' && chs[i] >= 'A') {
                    right++;
                } else if (chs[i] <= 'z' && chs[i] >= 'a') {
                    right++;
                } else {
                    reverse(chs, left, right);
                    right++;
                    left = right;
                }
            }
            String ret = new String(chs);
            System.out.println(ret);*/
        }

    }
    public static void reverse(char[] chs, int left, int right) {
        while (left < right){
            char temp = chs[right];
            chs[right] = chs[left];
            chs[left] = temp;
            right--;
            left++;
        }
    }

}
