package com.karthik.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); // At this line Object is created
		// The number of times you calls bean in xml file, same number of time your
		// object is being created
		Alien obj = (Alien) context.getBean("alien", Alien.class); // by default bean scope is SINGLETON but to make
																	// creation diff each call we have to use use bean
																	// scope as PROTOTYPE and under PROTOTYPE object
																	// will be only created when you say getBean unlike
																	// automatically object creation under SINGLETON
		// obj.age = 21;
		// System.out.println(obj.age);

		// System.out.println(obj.getSalary());
		obj.code();
		// System.out.println(obj.age);

		// Alien obj1 = (Alien) context.getBean("alien", Alien.class);
		// System.out.println(obj.getSalary());
		// System.out.println(obj1.age);

	}

}
