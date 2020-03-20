package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve bean from container
		Coach theCoach	=	context.getBean("myTrackCoach",Coach.class);
		
		//Calling a function in trackCoach
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
