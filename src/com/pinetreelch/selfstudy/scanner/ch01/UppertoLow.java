package com.pinetreelch.selfstudy.scanner.ch01;
import java.util.Scanner;


public class UppertoLow {
	
	public static String solution(String str) {
//		char[] x = str.toCharArray();
		
		String answer ="";
//		for(int i = 0; i < x.length; i++) {
//			if(Character.isUpperCase(x[i])) {
//				answer = answer +Character.toLowerCase(x[i]);
//			} else {
//				answer = answer + Character.toUpperCase(x[i]);
//			}
//		}
		
		for(char x : str.toCharArray()) {
			if(Character.isUpperCase(x)) answer += Character.toLowerCase(x);
			else answer += Character.toUpperCase(x);
		}
		
		return answer;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(solution(str));
	}

}
