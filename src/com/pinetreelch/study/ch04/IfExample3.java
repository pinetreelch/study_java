package com.pinetreelch.study.ch04;

public class IfExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int 타입의 변수를 2개 선언하고
		// 두 정수 가 주어졌을때 두 정수를 비교하여
		// 크기 비교 결과를 나타내는 프로그램을 작성하시오
		
		int a, b;
		a=12;
		b= 10;
		
		if(a>b) {
			System.out.println("a가 b보다 크다");
		} else if(a<b) {
			System.out.println("b가 a보다 크다");
		} else {
			System.out.println("두 수의 크기가 같다.");
		}
	}

}
