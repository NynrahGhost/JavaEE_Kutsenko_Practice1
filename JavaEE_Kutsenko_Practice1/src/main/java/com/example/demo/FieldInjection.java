package com.example.demo;

public class FieldInjection {

	private String initMsg;
	
	public FieldInjection() {
		// TODO Auto-generated constructor stub
	}
	
	public void setInitMsg(String initMsg) {
		this.initMsg = initMsg;
	}
	
	public String getInitMsg() {
		return initMsg;
	}
	
	public void print() {
		System.out.println('\n'+initMsg+'\n');
	}

}
