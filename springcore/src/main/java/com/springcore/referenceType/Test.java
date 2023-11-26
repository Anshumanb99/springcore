package com.springcore.referenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Emp;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/referenceType/referenceConfiguration.xml");
        A temp=(A) context.getBean("Aref");
        System.out.println(temp);
        System.out.println(temp.getX());
        System.out.println(temp.getObj());
        System.out.println(temp.getObj().getY());
        A temp2=(A) context.getBean("Aref2");
        System.out.println(temp2);

	}

}
