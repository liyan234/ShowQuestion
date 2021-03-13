package day42;

import java.util.Scanner;

public class D2 {
    public static char encryption(char c) {
        if(c >= 'a' && c < 'z') {
            return (char)(c + 1 - 32);
        } else if(c == 'z') {
            return 'A';
        } else if(c >= 'A' && c < 'Z') {
            return (char)(c + 1 + 32);
        } else if(c == 'Z') {
            return 'a';
        } else if(c >= '0' && c < '9') {
            return (char)(c + 1);
        } else if(c == '9') {
            return '0';
        } else {
            return c;
        }
    }
    //字符解密过程
    public static char decryption(char c) {
        if(c > 'a' && c <= 'z') {
            return (char)(c - 1 - 32);
        } else if(c == 'a') {
            return 'Z';
        } else if(c > 'A' && c <= 'Z') {
            return (char)(c - 1 + 32);
        } else if(c == 'A') {
            return 'z';
        } else if(c > '0' && c <= '9') {
            return (char)(c - 1);
        } else if(c == '0') {
            return '9';
        } else {
            return c;
        }
    }
    //加密，将输入的字符串中的每个字符进行加密。
    public static String enCryption(String s) {
        char[] cs = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < cs.length; i++){
            sb.append(encryption(cs[i]));
        }
        return sb.toString();
    }
    //解密
    public static String deCryption(String s) {
        char[] cs = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < cs.length; i++){
            sb.append(decryption(cs[i]));
        }
        return sb.toString();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.nextLine();//加过密的密码
            String s2 = sc.nextLine();//解密的密码
            System.out.println(enCryption(s1));
            System.out.println(deCryption(s2));
        }
        sc.close();
    }
}
