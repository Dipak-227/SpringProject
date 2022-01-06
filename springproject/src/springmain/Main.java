package springmain;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println("Showing Output Of Spring Program.");
		ApplicationContext con = new ClassPathXmlApplicationContext("springmain/config.xml");
		
		School sc = (School)con.getBean("School1");
		School sc1 = (School)con.getBean("School2");
		Student st = (Student)con.getBean("Student2");
		System.out.println(sc);
		System.out.println(sc1);
		System.out.println(st);
	}

}
