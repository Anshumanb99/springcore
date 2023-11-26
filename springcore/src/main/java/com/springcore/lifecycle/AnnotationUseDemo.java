package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationUseDemo {

	@Override
	public String toString() {
		return "AnnotationUseDemo [subject=" + subject + "]";
	}

	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public AnnotationUseDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct	
	public void start() {
		 System.out.println("inside init() method of AnnotationUseDemo class");
	}
	
	@PreDestroy
	public void end() {
		 System.out.println("inside destroy() method of AnnotationUseDemo class");
	}
	
}
