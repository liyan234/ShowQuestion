package day23;

import java.util.HashSet;
import java.util.Set;

public class Example {
    String str=new String("hello");
    char[]ch={'a','b'};

    public static void main(String args[]){
        Example ex=new Example();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);

        Set<Integer> st = new HashSet<>();
        st.add(1);
    }
    public void change(String str,char ch[]){
        str="test ok";
        ch[0]='c';
    }
}
