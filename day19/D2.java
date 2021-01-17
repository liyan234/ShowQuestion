package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class D2 {
    static class People {
        private String name ;
        private int exam;

        public People(String name, int exam) {
            this.name = name;
            this.exam = exam;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int temp = sc.nextInt();
            ArrayList<People> list = new ArrayList<>();

            for (int i = 0; i < x; i++) {
                String name = sc.next();
                int exam = sc.nextInt();
                People p = new People(name, exam);
                list.add(p);
            }
            if (temp == 0) {
                // 后面减前面为降序
                list.sort((o1, o2) -> o2.exam - o1.exam);
            } else {
                list.sort( (o1, o2) -> o1.exam - o2.exam);
            }
            for (int i = 0; i < x; i++) {
                System.out.println(list.get(i).name + " " + list.get(i).exam);
            }
        }
    }

}
