package amit.learns.jdbc.mysql;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 

import amit.learns.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext ap = new ClassPathXmlApplicationContext("config.xml");
		Student stf = ap.getBean("entity", Student.class);
		DataSetterDaoImpl dataSetter = ap.getBean("datasetter", DataSetterDaoImpl.class);

		System.out.println("Number of rows affected by inseret are: "+  dataSetter.insert(stf));
		
		((ClassPathXmlApplicationContext)ap).close();

	}
}
