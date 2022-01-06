package springref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		  ApplicationContext con = new ClassPathXmlApplicationContext("springref/refconfig.xml");
		  A a = (A) con.getBean("aclass");
		  System.out.println("X:- "+a.getX());
		
		//  System.out.println("Y:- "+a.getOb().getY());
		//  System.out.println(a);
	}

}
