package com.pinetreelch.study.ch04;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 80;
		
		if(score >= 90) {
			System.out.println("A");
		}else {
			System.out.println("A는 아니구나");
		}
		
		int score1 = 63; 
		
		if(score1 >= 90) {
			System.out.println("A");
		} else if(score1>= 80 && score1 <= 89){
			System.out.println("B9");
		} else if(score1>= 70 && score1 <= 79){
			System.out.println("C9");
		} else if(score1>= 60 && score1 <= 69){
			System.out.println("D");
		} else {
			System.out.println("F");
		} 
		
		
		
		if(score1 >= 90) {
			if(score1>= 97) {
				System.out.println("A+");
			} else if(score1 >= 92) {
				System.out.println("92<=score<97");
			}else {
				System.out.println("90~92");
			}
		}else if (score1 >= 80) {
			if(score1 >= 87) {
				System.out.println("B+");
			}else if(score1 >= 82){
				System.out.println("82~82");
			}else {
				System.out.println("80-82");
			}
		}else if (score1 >= 70) {
			if(score1 >= 77) {
				System.out.println("C+");
			}else if(score1 >= 72){
				System.out.println("72~77");
			}else {
				System.out.println("70-72");
			}
		}else if (score1 >= 60) {
			if(score1 >= 67) {
				System.out.println("D+");
			}else if(score1 >= 62){
				System.out.println("62~67");
			}else {
				System.out.println("60-62");
			}
		}else {
			System.out.println("F");
		}
		
	}

}
