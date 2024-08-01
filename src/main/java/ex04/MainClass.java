package ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("autowired-context.xml");
        context.getBean("computer", Computer.class).computerInfo();
    }
}
