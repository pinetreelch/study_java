package com.pinetreelch.study.ch04;

public class MultiplicaitonTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 구구단 2단 출력 프로그램
		
		for(int i = 1; i <=9; i++) {
			System.out.println("2 * "+i+" = "+2*i);
		}
		
		// 2단 부터 9단까지 출력하는 프로그램 작성
		for(int i = 2; i <=9; i++) {
				System.out.println(i+"단:");
			for(int j = 1; j <=9; j++) {
				System.out.println(i+" * "+j+ " = " + i*j);
				
				if(j ==9 ) System.out.println("-----------------");
			}
		}

	}

}
