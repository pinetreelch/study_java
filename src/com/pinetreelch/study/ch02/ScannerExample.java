package com.pinetreelch.study.ch02;

import java.util.Scanner;

public class ScannerExample {
	
	public static int solution(String str, char ch) {
		
		str.toUpperCase();
		Character.toUpperCase(ch);
		
		int answer = 0;
		
//		for(int i = 0; i < str.length(); i++) {
//			if(ch == str.charAt(i)) { answer++;} 
//		}
		
		for(char x : str.toCharArray()){ //computer str[0]= c str[1]= o.....
			if(x== ch) answer++; 			// ch = c
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next(); // next가 뭐지?
		char ch = kb.next().charAt(0);
		
		System.out.println("정답은~~~~~~~"+ScannerExample.solution(str, ch));
		
				
	}
}

