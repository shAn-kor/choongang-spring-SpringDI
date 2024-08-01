package ex05.javaconfig;

import ex01.SpringTest;
import ex02.constructor.Chef;
import ex02.constructor.Hotel;
import ex02.setter.MemberDAO;
import ex02.setter.MyDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 자바 설정 파일로 쓸 클래스
public class JavaConfig {
    @Bean
    public SpringTest test() {
        return new SpringTest();
    }

    @Bean
    public Chef chef() {
        return new Chef();
    }

    @Bean
    public Hotel hotel() {
        return new Hotel(chef());
    }

    @Bean
    public MyDataSource myDataSource() {
        MyDataSource myDataSource = new MyDataSource();
        myDataSource.setUid("jsp");
        myDataSource.setUpw("jsp");
        myDataSource.setUrl("localhost");
        return myDataSource;
    }

    @Bean
    public MemberDAO memberDAO() {
        MemberDAO memberDAO = new MemberDAO();
        memberDAO.setMyDataSource(myDataSource());
        return memberDAO;
    }
}
