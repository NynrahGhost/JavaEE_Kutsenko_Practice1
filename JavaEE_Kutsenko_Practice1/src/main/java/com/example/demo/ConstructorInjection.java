package com.example.demo;

public class ConstructorInjection {

	public String text;
	
	public ConstructorInjection(String in) {
		text = in;
		System.out.println('\n'+text+'\n');
	}

}
