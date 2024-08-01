package ex02.constructor;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        // java 문법
//        Hotel hotel = new Hotel(new Chef());
//        Chef chef = hotel.getChef();
//        chef.cooking();

        // spring 문법
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("application-context.xml");
        Chef chef = context.getBean("hotel", Hotel.class).getChef();
        chef.cooking();
    }
}
