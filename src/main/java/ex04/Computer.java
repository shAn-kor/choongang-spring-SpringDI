package ex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Computer {
	// 컴퓨터 클래스에 의존객체 자동주입 명령을 이용해서 주입되도록 처리 후 메인에서 computerInfo() 메서드 실행

	@Autowired
//	@Qualifier("mouse")
	private Mouse mouse;

	@Autowired
//	@Qualifier("keyboard")
	private Keyboard kb;

	@Autowired
//	@Qualifier("monitor")
	private Monitor monitor;
	
	public void computerInfo() {
		System.out.println("***컴퓨터 정보***");
		mouse.info();
		kb.info();
		monitor.info();
	}
	
}
