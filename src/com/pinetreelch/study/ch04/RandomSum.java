package com.pinetreelch.study.ch04;

public class RandomSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100 사이의 램덤 정수 2개를 발생시켜
		// 두수 사이의 합을 구하여라
		
		double min = 1.0;
		double max = 100.0;
		int sum =0 ;

		for(int i=1; i <= 2; i++) {
			int random = (int)(Math.random()*(max-min) + min);
			System.out.println("랜덤 변수 값 "+i+" = "+random);
			 sum = random + sum;
		}
		System.out.println("두 수의 합 = "+ sum);
	}
} 


