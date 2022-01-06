package springmain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springmain.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("springmain/config.xml");
        
        Student stud = (Student)context.getBean("Student1");
        
        School sc = (School)context.getBean("School1");
        School sc1 = (School)context.getBean("School2");
        System.out.println(stud);
        System.out.println(sc);
        System.out.println(sc1);
    }
}
