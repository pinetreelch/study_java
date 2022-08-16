package com.pinetreelch.study.ch04;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double min = 1.0;
		double max = 10.0;
		
		int l =0;

		
		while(true) {
			
			int random = (int)((Math.random()) * (max-min)+ min);
			System.out.println("while문 "+l+"번째 : "+random);
			l ++;
			if(random == 5) {
				break;
			}
		}
		
		System.out.println("========================");
		for(int i = 1; i<10; i ++) {
			int random2 = (int)((Math.random()) * (max-min)+ min);
			System.out.println("for문 : "+random2);
			if(random2==5) {
				break;
			}
		}
		
		System.out.println("========================");
		
		for (int a = 1; a <= 10; a++) {
			for(int b = 1; b< 10; b++) {
				int random3 = (int)((Math.random()) * (max-min)+ min);
				System.out.println(a+" : "+b+" : "+ random3);
				if(random3 ==5) {
					
				}
			}
		}
	}
}
