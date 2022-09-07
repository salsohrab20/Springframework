package com.salman1.project2;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	
	public void drive() {
		
		System.out.println("Chal rha hai..");
	};

}
