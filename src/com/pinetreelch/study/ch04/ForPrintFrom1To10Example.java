package com.pinetreelch.study.ch04;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 10까지 더하는 프로그램 작성
		int sum = 0;
		
		for(int i = 0; i <= 10; i ++) {
			System.out.println(i);
			sum = sum + i; // sum += i; 
			System.out.println("sum::"+sum);
		}
		System.out.println("sum: "+sum);
		
		double min = 1;
		double max = 45;
		int random = (int)((Math.random()*(max - min))+ min);
		System.out.println(random);
		System.out.println(Math.random());
	}

}
