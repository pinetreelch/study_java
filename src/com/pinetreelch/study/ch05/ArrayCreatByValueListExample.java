package com.pinetreelch.study.ch05;

public class ArrayCreatByValueListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scoreEnglish;
		int[] scoreMath;
		int[] scoreChemistry = {88, 99, 45, 86, 34};
		
		String[] name = {"장원영", "장동건", "고서영"};
		
		System.out.println("1번 화학성적 : "+ scoreChemistry[0]);
		
		
		double sum = 0;
		for(int i = 0; i < scoreChemistry.length; i++) {
			sum = sum + scoreChemistry[i];
			if(i == 4) {System.out.println("화학성적 평균 : "+sum/scoreChemistry.length);}
		}	
	}
}
