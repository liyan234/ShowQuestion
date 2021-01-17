package day19;

public class D1 {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        boolean[] bool = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (s.contains(p[i])) {
                bool[i] = true;
            }
        }

        return bool;
    }
}
