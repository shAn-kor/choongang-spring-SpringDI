package ex03.autowired;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("autowired-context.xml");
        Printer printer = context.getBean("printer", Printer.class);
        Document document = printer.getDocument();
        System.out.println(document.data);
    }
}
