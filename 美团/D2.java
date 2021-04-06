package 美团;

import javafx.scene.transform.Scale;

import java.util.Arrays;
import java.util.Scanner;

public class D2 {

    /**
     * 小团是某综艺节目的策划，他为某个游戏环节设计了一种晋级规则，
     * 已知在这个游戏环节中每个人最后都会得到一个分数score_i，显而易见的是，游戏很有可能出现同分的情况，小团计划该环节晋级人数为x人，则将所有人的分数从高到低排序，所有分数大于等于第x个人的分数且得分不为0的人都可以晋级。
     *
     * 请你求出本环节的实际晋级人数。显然这个数字可能是0，
     * 如果所有人的得分都是0，则没有人满足晋级条件。
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }
            int k = 0;
            int count = 0;
            Arrays.sort(arr);
            if (arr[n-1] == 0) {
                System.out.println(arr.length);
            } else {
                for (int i = arr.length - 1; i >= 0; i--) {
                    if (arr[i] != 0 && m > 0) {
                        count ++;
                        m--;
                        k = i;
                    }
                }
            }

            if (m == 0) {
                int c = k - 1;
                while (c >= 0 && arr[c] == arr[k]) {
                    count++;
                    c--;
                }
            }
            System.out.println(count);
        }
    }
}
