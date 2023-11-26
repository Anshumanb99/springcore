package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

public class Test {

	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collectionConfiguration.xml");
	        Emp Employee1=(Emp) context.getBean("emp1");
	        System.out.println(Employee1);
	        System.out.println(Employee1.getEmpname());
	        System.out.println(Employee1.getAddress());
	        System.out.println(Employee1.getCourses());
	        System.out.println(Employee1.getPhones());
	        System.out.println(Employee1.getClass());

	}

}
