package com.pinetreelch.study.ch04;

public class RandomSumAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100 사이의 램덤 정수 2개를 발생시켜
		// 두수 사이의 합을 구하여라
		
		double num1 = 1.0;
		double num2 = 100.0;
		
		int sum = 0, min =0, max = 0;
		
		int random1 =(int) ((Math.random() * (num2-num1))+ num1);
		int random2 =(int) ((Math.random() * (num2-num1))+ num1);
		
		if (random1 < random2) {
			max = random2;
			min = random1;
		} else if (random1 > random2) {
			max = random1;
			min = random2;
		} else {
			System.out.println("서로 다른 값을 입력하세요");
			return;
		}
		
		System.out.println("min : "+ min + ","+ "max"+ max);
		
		for (int i = min; i <= max; i++) {
			sum += 1;
			System.out.println(i + " : "+ sum);
		}
		System.out.println("total:");
	}
} 


