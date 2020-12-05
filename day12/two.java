package day12;

public class two {
    public String[] getGray(int n) {
        String[] ret = null;
        if (n == 1) {
            ret = new String[]{"0", "1"};
        } else {
            String[] str = getGray(n-1);
            ret = new String[2 * str.length];
            for(int i = 0; i < str.length; i++) {
                ret[i] = "0" + str[i];
                ret[ret.length - 1 - i] = "1" + str[i];
            }
        }
        return ret;
    }
}
