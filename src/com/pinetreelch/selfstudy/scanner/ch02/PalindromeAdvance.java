package com.pinetreelch.selfstudy.scanner.ch02;

import java.util.Scanner;

public class PalindromeAdvance {
	
	public static String solution(String str) {
		
		String answer = "NO"; 
		String word = "";
		String word2 = "";
		
		String receive = str.toUpperCase();
		
		StringBuffer sb = new StringBuffer(receive);
		
		String rreceive = sb.reverse().toString();

		char[] ch = receive.toCharArray();
		char[] ch2 = rreceive.toCharArray();
		
		for(char c: ch) {
			if(Character.isLetter(c)) {
				word = word + c;
			} else {
				//bypass
			}
			
		}
		
		for(char c : ch2) {
			if(Character.isLetter(c)) {
				word2 = word2 + c;
			} else {
				//bypass
			}
		}
		
		
		
		
		if(word.equals(word2)) {
			answer = "YES" ;
		} 
		return answer;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		String str = kb.nextLine();
		
		System.out.println(solution(str));
	}
}
