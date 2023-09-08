package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvUser {
	public static void main(String[] args) {
		//1.Spring 컨테이너를 구동한다.
		AbstractApplicationContext factory = 
		new GenericXmlApplicationContext("applicationContext.xml");
		//2.Spring 컨테이너로 부터 필요한 객체를 요청한다.
		//객체요청 : 컨테이너.getBean("bean아이디")
		TV tv1 = (TV) factory.getBean("tv");
		tv1.powerOn();
		//3.스프링 컨테이너 종료한다.
		factory.close();
	}
}
