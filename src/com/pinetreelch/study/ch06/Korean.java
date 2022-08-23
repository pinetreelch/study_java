package com.pinetreelch.study.ch06;

public class Korean {
	
	String name = "";
	String ssn = "";
	String nationality ="";
	int age = 1;
	Korean(){
		
	}
	
	Korean (String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}
	
	Korean (String name, int age){
		this.name= name;
		this.age = age;
	}
}
