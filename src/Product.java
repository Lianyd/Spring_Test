import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

public class Product {
//    String name;
//    public static void main(String[] args){
//        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-config.xml"});
//        Product product1 = context.getBean("product",Product.class);
//        product1.setName("Excellent snake oil");
//        System.out.println("product1: " + product1.getName());
//    }
//
//    public void setName(String a){
//        name = a;
//    }
//
//    public String getName(){
//        return name;
//    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-config.xml"});
        Calendar calendar = context.getBean("calendar", Calendar.class);
        System.out.println(calendar);
    }
}
