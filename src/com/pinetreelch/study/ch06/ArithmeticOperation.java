package com.pinetreelch.study.ch06;

public class ArithmeticOperation {
	
	int sum = 0;
	
	public int sum (int a, int b){
		sum = a + b;
		return sum;
	}
	
	public int deduct (int a, int b){
		sum = a - b;
		return sum;
	}
	
	public int multiply (int a, int b){
		sum = a * b;
		return sum;
	}
	
	public int divide (int a, int b){
		sum = a / b;
		return sum;
	}
	
	public int remainder (int a, int b) {
		sum = a%b ;
		return sum;
	}
	
	public void  say (int sai) {
		 System.out.println("값은"+sai +"입니다");
	}
	
	public void sentence (String x, String y) {
		System.out.println(x+y);
	}
	
	static void staticTest() {
		System.out.println("나는 로니당");
	}
	
	public String aaa(int a) {
		return "";
	}
}
