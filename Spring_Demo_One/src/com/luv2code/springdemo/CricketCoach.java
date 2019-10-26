package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	//Define the field for constructor Injection
	private FortuneService fortuneService;
		
	//Define a no-arg constructor for MyApp
	public CricketCoach() {
		
	}
	
	//Define the setter function for the constructor Injection
	public void setFortuneService(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice 2hr for balling and 3hr for batting";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
