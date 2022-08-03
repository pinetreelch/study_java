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
		
		
		double a1 = ((1+2/3)-5/8)*(9+4/5);
		
		System.out.println("1번문제: "+ a1);
		
		double a2 = 5-(3.25-(1+5/6))*(12/17);
		System.out.println("2번 문제: "+ a2);
		
		int b1 = 8+7+5;
		int b2 = 1+9+5;
		int b3 = 5+6+6;
		int b4 = 4+7+1;
		int b5 = 7+5+5;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		
		sum(8,7,5);
		sum(1,9,5);
		sum(5,6,6);
		sum(4,7,1);
		sum(7,5,5);
		 
		divide("홍길동",60,70,85,90,45);
		divide("박말순",50,75,70,60,70);
		divide("고장난",55,60,64,58,90);
		divide("도룡뇽",80,70,63,88,78);
	}	
	
	public static void sum(int a, int b, int c) {
		System.out.println(a+"+"+b+"+"+c+"="+(a+b+c));
	}
	
	public static void divide(String name, int english, int math, int physics, int music, int athletic) {
		System.out.println(name+"(평균): "+ (double)(english+math+physics+music+athletic)/5);
	}

}
