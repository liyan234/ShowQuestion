package 百度;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class D2 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            // 用链表的话 插在他输了的后面 赢了的前面
            // 然后去判断中间应该有几位
            int n = sc.nextInt();
            int m = sc.nextInt();
            // 要获得其中一个为p的时候 p的标记位置
            int p = sc.nextInt();
            int winP = 0;
            int loseP = 0;
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < m; i++) {
                int w = sc.nextInt();
                int l = sc.nextInt();
                // 如果这链表中包含了w 就需要把l放在w的后面
                if (list.contains(w)) {
                    int x = list.indexOf(w);
                    // 如果已经有l了那木找到l的位置 是否在w的后面
                    // 如果已经都存在 则变动位置
                    if(list.contains(l)) {
                        int y = list.indexOf(l);
                        if (x < y) {
                            //需要改变l的位置
                            list.remove(l);
                            list.add(x + 1,l);
                        }
                    } else {
                        //如果没有l 那木就把l放在链表的末尾
                        list.addLast(l);
                    }

                    // 链表中没有w要插入w
                } else {
                    // 如果链表中有l则把w插入到l的前面
                    if (list.contains(l)) {
                        int y = list.indexOf(l);
                        list.add(y,w);

                    // 如果链表没有w 和 l,则将w放在链表的首部
                        // l放在链表的尾部
                    } else {
                        list.addFirst(w);
                        list.addLast(l);
                    }
                }
                // 如果两个中有p 则需要更新p应该存在的位置
                if (w == p) {
                    // loseP 就是p的最差的名次 - 1
                    // 链表位置要 + 1
                    loseP = list.indexOf(l) ;
                }
                if (l == p) {
                    // winP 就是p的最好的名次 + 1
                    // 得到的位置不一样 要+1
                    winP = list.indexOf(w) + 2;
                }
            }

            if (winP == 0) {
                winP = 1;
            }
            if (loseP == 0) {
                loseP = list.size();
            }

            for (int i = winP; i < loseP; i++) {
                System.out.print(i + " ");
            }
            System.out.println(loseP);
        }
    }
}
