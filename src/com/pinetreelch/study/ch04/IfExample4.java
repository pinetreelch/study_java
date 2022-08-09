package com.pinetreelch.study.ch04;

public class IfExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int타입의 변수를 1개 선언하고
		// 짝수인지 홀수인지 판단하여 결과를 출력하는 프로그램을 작성하시오 
		
		int x = 9;
		
		
		if(x != 0) {
			if(x%2 == 0 ) {
				System.out.println("짝수입니다");
			} else {
				System.out.println("홀수입니다");
			}
		} else {
			System.out.println("0은 양의 정수가 아닙니다");
		}
	
	}

}
