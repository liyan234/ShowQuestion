package day18;

public class two {
    public static void main(String[] args) {
        long poor = 0;
        long rich = 0;
        for (int i = 1; i <= 30 ; i++) {
            rich = 10 + rich;
            poor = poor  + (long)Math.pow(2, i);
        }
        System.out.println(rich + " " + poor);
    }
}
