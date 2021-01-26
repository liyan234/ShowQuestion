package day27;

import java.util.Scanner;

public class D2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String ip = sc.nextLine();
            String num = sc.nextLine();
            //ip地址转为数字
            System.out.println(changeIp(ip));
            //数字转为IP
            System.out.println(changeNum(num));
        }
    }
    public static Long changeIp(String ip) {
        String[] ips = ip.split("\\.");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ips.length; i++) {
            sb.append(helpChangeIp(ips[i]));// 转化为2进制
        }
        // 字符串转化为长整型
        return Long.parseLong(sb.toString(),2);// 基数为二进制的
    }

    public static String helpChangeIp(String s) {
        StringBuffer sb = new StringBuffer();
        int num = Integer.valueOf(s);
        int k = 1 << 7;
        for (int i = 0; i < 8; i++) {
            int fa = (num & k) == 0 ? 0:1;
            sb.append(fa);
            num = num << 1;
        }
        return sb.toString();
    }

    public static String changeNum(String s) {
        // 转化为IP地址
        StringBuffer sb = new StringBuffer();
        //             转化为二进制            转化为长整型
        String ip = Long.toBinaryString(Long.parseLong(s));
        String as = "";
        for ( int i = ip.length(); i < 32; i++) {
            as += "0";
        }
        ip = as + ip;
        String[] ips = new String[4];
        ips[0] = ip.substring(0,8);
        ips[1] = ip.substring(8,16);
        ips[2] = ip.substring(16,24);
        ips[3] = ip.substring(24);

        for(int i = 0; i < 4; i++) {
            sb.append(Integer.valueOf(ips[i], 2));
            if(i != 3) {
                sb.append(".");
            }
        }
        return sb.toString();

    }
}
