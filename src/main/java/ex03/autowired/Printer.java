package ex03.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.beans.JavaBean;


public class Printer {
    /*
    *   Autowired
    *   빈 객체를 자동을 주입하게 되는데, 먼저 타입으로 찾아서 주입, 이름으로 찾아서 주입
    *
    *   생성자, 메서드, 멤버변수 모두 사용 가능하다
    *
    *   멤버변수에 autowired 사용 시 기본 생상자가 반드시 필요하다
    *
    *   Autowired(required=false) : 스프링의 주입할 빈이 없으면 에러 발생 대신 무시하고 지나간다
    */
    @Autowired
    @Qualifier("doc2")
    private Document document;

    public Printer(){}
    // 생성자 주입
//    @Autowired
    public Printer(Document document) {
        this.document = document;
    }

    public Document getDocument() {
        return document;
    }

    // setter 주입
    public void setDocument(Document document) {
        this.document = document;
    }
}
