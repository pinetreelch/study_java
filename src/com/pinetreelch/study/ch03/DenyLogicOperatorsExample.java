package com.pinetreelch.study.ch03;

public class DenyLogicOperatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//논리부정연산자
		boolean play = true;
		
		System.out.println("play: "+ play);
		
		play =!play;
		System.out.println("play: "+ play);
		
		play=!play;
		System.out.println("play: "+ play);
		
		int j = 3;
		
		if(!(j==3)) {
			System.out.println("3이 아님");}
		else {
			System.out.println("3임");
		}
	}

}
