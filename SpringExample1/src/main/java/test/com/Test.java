package test.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
		Employee emp= (Employee) context.getBean("employeeBean");
		System.out.println(emp);

	}

}
