package com.springcore.standaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standaloneCollection/standaloneCollectionConfiguration.xml");
	        Emp Employee1=(Emp) context.getBean("emp1");
	        System.out.println(Employee1);
	        System.out.println(Employee1.getFriends().getClass().getName());
	        

	}

}
