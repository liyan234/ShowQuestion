package day42;

import java.util.Scanner;

public class D1 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();

            int ret = iConverDateToDay(year, month, day);
            System.out.println(ret);
        }

    }

    public static int iConverDateToDay(int year, int month, int day) {
        if (year <= 0 || month <= 0 || month > 12 || day > 31 ) {
            return -1;
        }
        // 判断是否为闰年
        if(judgeR(year)) {
            // 为闰年 二月为29天
            int ret = 0;
            for (int i = 1; i <= month; i++){
                if ( i == month) {
                    if (i == 2 || day > 29) {
                        return -1;
                    }
                    if ( (i == 1 || i == 3 || i == 5 ||
                            i == 7 || i == 8 || i== 10 || i == 12 ) && day > 31) {
                        return -1;
                    }
                    if( (i == 4 || i == 6 || i == 9 ||
                            i == 11 ) && day > 30) {
                        return -1;
                    }
                    ret += day;
                    break;
                }
                if (i == 2) {
                    ret += 29;
                } else if (i == 1 || i == 3 || i == 5 ||
                        i == 7 || i == 8 || i== 10 || i == 12) {
                    ret += 31;
                } else {
                    ret += 30;
                }
            }
            return ret;
        } else {
            int ret = 0;
            for (int i = 1; i <= month; i++){
                if ( i == month) {
                    if (i == 2 || day > 28) {
                        return -1;
                    }
                    if ( (i == 1 || i == 3 || i == 5 ||
                            i == 7 || i == 8 || i== 10 || i == 12 ) && day > 31) {
                        return -1;
                    }
                    if ((i == 4 || i == 6 || i == 9 ||
                            i == 11 ) && day > 30) {
                        return -1;
                    }
                    ret += day;
                    break;
                }
                if (i == 2) {
                    ret += 28;
                } else if (i == 1 || i == 3 || i == 5 ||
                        i == 7 || i == 8 || i== 10 || i == 12) {
                    ret += 31;
                } else {
                    ret += 30;
                }
            }
            return ret;

        }

    }

    public static boolean judgeR(int year) {
        if ( (year%4 == 0 && year%100 != 0) || year%400 == 0) {
            return true;
        }
        return false;
    }

}
