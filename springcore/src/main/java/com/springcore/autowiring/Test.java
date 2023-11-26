package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.constructorInjection.Person;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowiring/AutoConfiguration.xml");
		
		//uncomment line 14 15 and comment line 18 19. uncomment line 10-14 and comment line 16-20 in xml file
//	    Emp emp1=(Emp) context.getBean("emp1");
//	    System.out.println(emp1);
	    
	  
	    Emp emp2=(Emp) context.getBean("emp2");
	    System.out.println(emp2);
	    
	    Emp emp3=(Emp) context.getBean("emp3");
	    System.out.println(emp3);

	}

}
