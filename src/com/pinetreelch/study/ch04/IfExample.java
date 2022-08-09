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
		
		
		// 1
		if(score1 >= 90) {
			if(score1>= 97) {
				System.out.println("A+");
			} else if(score1 >= 92) {
				System.out.println("A");
			}else {
				System.out.println("A-");
			}
		}else if (score1 >= 80) {
			if(score1 >= 87) {
				System.out.println("B+");
			}else if(score1 >= 82){
				System.out.println("B");
			}else {
				System.out.println("B-");
			}
		}else if (score1 >= 70) {
			if(score1 >= 77) {
				System.out.println("C+");
			}else if(score1 >= 72){
				System.out.println("C");
			}else {
				System.out.println("C-");
			}
		}else if (score1 >= 60) {
			if(score1 >= 67) {
				System.out.println("D+");
			}else if(score1 >= 62){
				System.out.println("D");
			}else {
				System.out.println("D-");
			}
		}else {
			System.out.println("F");
		}
		
		
		//2
		
		
		if(score >= 90) {
			if(score >= 97) {
				System.out.println("A+");
			} else if (score <= 92) {
				System.out.println("A-");
			} else {
				System.out.println("A");
			}
		} else if(score >= 80 & score < 90) {
			if(score >= 87) {
				System.out.println("B+");
			} else if(score <= 82) {
				System.out.println("B-");
			} else {
				System.out.println("B");
			}
		} else if(score >= 70 & score < 80) {
			if(score >= 77) {
				System.out.println("C+");
			} else if(score <= 72) {
				System.out.println("C-");
			} else {
				System.out.println("C");
			}
		} else if(score >= 60 & score < 70) {
			if(score >= 67) {
				System.out.println("D+");
			} else if(score <= 62) {
				System.out.println("D-");
			} else {
				System.out.println("D");
			}
		} else {
			System.out.println("F");
		} 
		
		
	}

}
