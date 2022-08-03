package com.pinetreelch.study.ch03;

public class CompareOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//비교연산자 ==
		
		int num = 10;
		int num2 = 20;
		
		boolean number = (num==num2);
		
		System.out.println(number);
		
		// != 앞 뒤 항의 값이 다른지 검사 틀리면 true, 같으면 false
		if(num != num2) {
			System.out.println("!=운 정답");
		}else {
			System.out.println("!=운 오답");
		}
		
		// <
		if(num < num2) {
			System.out.println("<운 정답");
		}else {
			System.out.println("<운 오답");
		}
		//<=
		
		if(num <= num2) {
			System.out.println("<=운 정답");
		}else {
			System.out.println("<=운 오답");
		}
		
		//>=
		if(num >= num2) {
			System.out.println(">=운 정답");
		}else {
			System.out.println(">=운 오답");
		}
		
	}

}
