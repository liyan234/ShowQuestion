package 微步;

public class D1 {
    public static int indexOf (String s, String pattern) {
        if (s == null || s == "" || s.length() < pattern.length()) {
            return -1;
        }

        char[] chs = s.toCharArray();
        char[] ps = pattern.toCharArray();

        int cl = chs.length;
        int pl = pattern.length();

        for (int i = 0; i < cl - pl + 1; i++) {
            if (chs[i] == ps[0]) {
                int k = i;
                for (int j = 0; j < pl; j++,k++) {
                    if (chs[k] != ps[j]) {
                        break;
                    } else {

                    }
                }
                if ( k - i == pl - 1 ){
                    return i;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bc";
        int x = indexOf(s1, s2);
        System.out.println(x);
    }
}
