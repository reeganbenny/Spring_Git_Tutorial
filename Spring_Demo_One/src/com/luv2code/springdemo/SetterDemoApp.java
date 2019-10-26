package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//Load the Spring Config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve the bean from spring file
		TrackCoach theCoach = context.getBean("myTrackCoach",TrackCoach.class);
		
		//Call the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getName());
		
		System.out.println(theCoach.getEmail());
		
		//Close the context
		context.close();

	}

}
