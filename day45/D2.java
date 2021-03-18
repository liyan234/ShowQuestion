package day45;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class D2 {


    public static boolean checkBrother(String A, String B) {
        int[] num = new int[26];
        for (int i = 0; i < A.length(); i++) {
            num[A.charAt(i) - 'a']++;
            num[B.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (num[i] != 0) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N = sc.nextInt(); //输入字典中单词的个数
            String[] str = new String[N];
            for(int i=0; i<N; i++){ //输入n个单词作为字典单词
                str[i]=sc.next();
            }
            // 查找兄弟单词
            String findStr = sc.next();//输入一个待查单词
            int ind = sc.nextInt(); //输入待查单词的 指定序号
            ArrayList<String> list = new ArrayList<>();
            for(int i=0; i<N; i++){
                if((str[i].length() == findStr.length()) && (!str[i].equals(findStr))){//长度相等 且 字符串不相等
                    if(checkBrother(findStr,str[i])){
                        list.add(str[i]);
                    }
                }
            }
            //输出
            System.out.println(list.size());

            Collections.sort(list);
            if(list.size()>=ind){
                System.out.println(list.get(ind-1));
            }


        }

    }
}
