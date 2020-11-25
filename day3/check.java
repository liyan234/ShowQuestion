package day3;

class Base{
    public Base(String s){
        System.out.print("B");
    }

    public Base(String s, int a) {
        System.out.println(123);
    }
}
class Derived extends Base{
    public Derived (String s) {
        super(s);
        System.out.print("D");
    }

    public Derived (String s, int b) {
        super(s, b);
    }
    public static void main(String[] args){
        new Derived("C");
    }
}


public class check {
    public static void main(String[] args) {
        Parenthesis parenthesis = new Parenthesis();

    }
}
