package 微步;

public class D2 {
    public static void main(String[] args) {
        int x = stackOverFlow(10);
    }

    private static int stackOverFlow(int i) {
        return stackOverFlow(i++) + i;
    }

}
