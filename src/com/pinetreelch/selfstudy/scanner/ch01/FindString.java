package com.pinetreelch.selfstudy.scanner.ch01;

import java.util.Scanner;

public class FindString {
	
	public static int solution(String str, char c) {
		int answer = 0;
	
		String vv = str.toUpperCase();
		char r = Character.toUpperCase(c);
		
		for(char x : vv.toCharArray()) {
			if(x == r) answer++;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		char c = kb.next().charAt(0); 				
		
		System.out.println(solution(str, c));
	}

}
