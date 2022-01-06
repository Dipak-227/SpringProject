package springci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext con = new ClassPathXmlApplicationContext("springci/ciconfig.xml");
		Person p = (Person)con.getBean("person1");
		System.out.println(p);
		Addition add = (Addition) con.getBean("add");
		add.doSum();
	}

}
