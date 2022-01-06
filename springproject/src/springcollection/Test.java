package springcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext con = new ClassPathXmlApplicationContext("springcollection/collectionconfig.xml");
		
		Employee em = (Employee)con.getBean("Emp1");
		System.out.println("Name:- "+em.getName());
		System.out.println("Address:- "+em.getAddress());
		System.out.println("Phone:- "+em.getPhones());
		System.out.println("Courses:- "+em.getCourse());
		System.out.println("Properties:- "+em.getProps());
	
	}

}
