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
	
	static int x = 3;
	
	static int retu (int a) {
		return a + 10; 
	}
	
	public void ttest() {
		ArithmeticOperation.staticTest();
	}
	
	int ttest1() {
		ArithmeticOperation arith = new ArithmeticOperation();
		arith.aaa(3);
		
		return 1;
	}
}
