package test.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext ctx= new ClassPathXmlApplicationContext("application.xml");
	EmployeeDAO e= (EmployeeDAO) ctx.getBean("edao");
	Employee emp= new Employee();
	emp.setId(101);
	emp.setName("Spring");
	emp.setCity("SP");
	//e.save(emp);
	//System.out.println("Saving Details successfully.....");
	//e.update(emp);
	e.delete(emp);
	System.out.println("Updating Details successfully.....");
	
	

	}

}
