package com.springcore.annotationAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/annotationAutowiring/Configuration.xml");
		
		Emp emp1=(Emp) context.getBean("employee");
	    System.out.println(emp1);

	}

}
