package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//Load the Spring Config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve the bean from spring file
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		//Call the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getTeam());
		
		System.out.println(theCoach.getEmailAddress());
		
		//Close the context
		context.close();

	}

}
