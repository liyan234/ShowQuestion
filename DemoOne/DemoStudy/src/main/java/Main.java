import frank.Duck;
import frank.Duck2;
import frank.Duck3;
import frank.Shop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
        //Spring开启容器的方式 ApplicationContext应用上下文（可以配置并且管理Bean对象）
        //ClassPathXmlApplicationContext 根据classPath 路径，指定一个xml 文件（配置文件）
        //并根据配置文件完成配置工作
        */

        ApplicationContext context = new
                ClassPathXmlApplicationContext("applications.xml");

        String str1 = (String) context.getBean("bit");
        //String str2 = context.getBean(String.class);
        //一旦bean容器里面有多个String类型的bean对象，这种方式就会报错

       /* Duck d2 = (Duck) context.getBean("d2");
        System.out.println(d2);

        Duck2 d3 = (Duck2) context.getBean("d3");
        System.out.println(d3);*/

       /* Duck3 duck3 = (Duck3) context.getBean("dk");
        System.out.println(duck3);*/

        Shop shop = (Shop) context.getBean("shop");
        System.out.println(shop);

    }
}
