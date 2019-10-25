package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	//Define the field for constructor Injection
	private FortuneService fortuneService;
	
	//Define a no-arg constructor for MyApp
	public BaseballCoach() {
		
	}
	//Define the constructor for the constructor Injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
