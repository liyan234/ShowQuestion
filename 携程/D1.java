package 携程;


import java.util.ArrayList;
import java.util.Scanner;

public class D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            ArrayList<String> list = new ArrayList<>();
            boolean bool = false;
            String word;
            while (!(word = sc.nextLine()).trim().isEmpty()) {
                String[] words = word.split(" ");
                for (int i = 0; i < words.length; i++) {
                    String w = words[i];
                    if (w.isEmpty()) {
                        break;
                    }
                    if (!w.trim().isEmpty()) {
                        if (bool) {
                            if (!w.equals("(")) {
                                if (!list.contains(w)) {
                                    list.add(w);
                                }
                            }
                            bool = false;
                        }
                        if(w.equals("from") || w.equals("inner")) {
                            bool = true;
                        }
                    }
                }
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }

        }
    }
}
