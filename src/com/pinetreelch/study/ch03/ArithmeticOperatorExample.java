package com.pinetreelch.study.ch03;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int 변수 y1에 초기값 5;
		// int 변수 y2에 초기값 2;
		
		// int 변수 result에 + 연산 후 출력;
		// int 변수 result2에 - 연산 후 출력;
		// int 변수 result3에 * 연산 후 출력;
		// int 변수 result4에 / 연산 후 출력;
		// int 변수 result5에 % 연산 후 출력;
		
		int y1 = 5;
		int y2 = 2;
		
		int result= y1 + y2;
		int result2= y1 - y2;
		int result3= y1 * y2;
		int result4= y1 / y2;
		int result5= y1 % y2;
		
		System.out.println("result: "+result);
		System.out.println("result2: "+result2);
		System.out.println("result3: "+result3);
		System.out.println("result4: "+result4);
		System.out.println("result5: "+result5);
		
		double result7 = y1 /y2;
		System.out.println("result7: "+ result7);
		
		double result6 = (double) y1 / y2;
		System.out.println("result6: "+result6);
	}	

}
