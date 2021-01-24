package day25;

import java.util.Scanner;

public class D2 {
    public static String[] ttttt = {"壹","贰","叁","肆","伍","陆","柒","捌","玖"};

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            String str = helpPrint(s);
            System.out.println(str);
        }*/
        System.out.println(ttttt[0]);
    }

    public static String helpPrint(String str) {
        String[] strArr = str.split("\\.");
        int number = Integer.valueOf(strArr[0]);

        StringBuffer sb = new StringBuffer();
        sb.append("人民币");
        // 亿元
        int yi = (int) number / 100000000;
        if (yi != 0) {
            sb.append(resvole(yi));
            sb.append("亿");
            number = number - yi*100000000;
        }
        // 万元
        int wan = (int) number / 10000;

        if (wan != 0) {
            sb.append(resvole(wan));
            sb.append("万");
            number = number - number * 10000;
        }

        //千百十
        String x = resvole(number);
        if (x.length() > 1) {
            sb.append(x);
            sb.append("元");
        }

        // 处理小数点
        if (strArr.length > 1) {
            String xiaoshu = strArr[1];
            sb.append(helpXiaoshu(xiaoshu));
        }
        // 处理千元出现的零
        String ret = sb.toString();
        return ret;


    }

    public static String resvole(double x) {
        StringBuffer sb = new StringBuffer();

        // 千位
        int qian = (int) x / 1000;
        if (qian != 0) {
            sb.append(ttttt[qian - 1]);
            sb.append("仟");
            x = x - qian * 1000;
        }
        // 百位
        int bai = (int) x /100;
        if (bai != 0) {
            sb.append(ttttt[bai - 1]);
            sb.append("佰");
            x = x - bai * 100;
        }

        if(qian!=0 && bai==0){
            sb.append("零");
        }
        // 十位
        int shi = (int) x /10;
        if (shi != 0) {
            sb.append(ttttt[shi-1]);
            sb.append("拾");
            x = x - shi*10;
        }

        if(bai!=0 && shi==0){
            sb.append("零");
        }
        int ge = (int) x % 10;
        if (ge != 0) {
            if (qian == 0 && bai == 0 && shi == 0) {
                sb.append("零");
            }
            sb.append(ttttt[ge-1]);
        }

        String ret = sb.toString();
        return ret;

    }

    public static String helpXiaoshu(String str) {
        String ret = "";
        if (str.equals("00") || str.equals("0")) {
            ret = "整";
        } else{
            if (str.charAt(0) != '0') {
                ret += ttttt[Integer.valueOf(str.charAt(0)+"") - 1] + "角";
            }
            if (str.length() > 1 && str.charAt(1) != '0') {
                ret += ttttt[Integer.valueOf(str.charAt(0)+"") - 1] + "分";
            }
        }
        return ret;
    }
}
