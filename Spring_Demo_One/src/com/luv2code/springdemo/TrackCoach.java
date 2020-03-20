package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	private String name;
	private String email;
	
	//Define a no-arg constructor for MyApp
	public TrackCoach() {
			
	}
	
		
	//Define the constructor for the constructor Injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}	

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k. ";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	//Defining init-method
	public void doMyStartupStuff() {
		System.out.println("Inside method doMyStartupStuff");
	}
	
	//Defining destroy-method
	public void doMyCleanupStuff() {
		System.out.println("Inside method doMyCleanupStuff");
	}
}























