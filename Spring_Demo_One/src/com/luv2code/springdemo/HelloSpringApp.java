package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myBaseballCoach",Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method for fortune Service
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
