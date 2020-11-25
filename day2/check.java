package day2;

public class check {
    public static void main(String[] args) {
        AntiOrder antiOrder = new AntiOrder();
        int[] arr = {1,2,3,4,5,6,7,0};
        System.out.println(antiOrder.count(arr,8));
    }
}
