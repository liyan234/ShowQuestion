package day1;


import java.util.*;

public class One {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();

            int count = 0;
            for (int i = 0; i <= str1.length(); i++) {
                StringBuilder st = new StringBuilder(str1);
                st.insert(i, str2);
                if (isHuiwen(st)) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }

    private static boolean isHuiwen(StringBuilder st) {
        int j = st.length() - 1;
        for (int i = 0; i < st.length() / 2; i++) {
            if (st.charAt(i) != st.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }


}
