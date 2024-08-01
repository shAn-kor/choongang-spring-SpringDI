package ex01;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        // 자바 방식
        System.out.println("자바 방식\n");
        SpringTest test = new SpringTest();
        test.hello();

        // 스프링 방식
        System.out.println("spring 방식 \n");

        // ApplicationContext : IoC 컨테이너
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("application-context.xml");
        context.getBean(SpringTest.class).hello();

    }
}
