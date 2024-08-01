package ex02.setter;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("application-context.xml");
        MemberDAO memberDAO = context.getBean("memberDAO", MemberDAO.class);
        System.out.println(memberDAO.getMyDataSource().getUid());
        System.out.println(memberDAO.getMyDataSource().getUpw());
        System.out.println(memberDAO.getMyDataSource().getUrl());
    }
}
