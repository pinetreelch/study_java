package com.pinetreelch.selfstudy.scanner.ch01;

import java.util.Scanner;

public class Scaaa {

	public static int solution(String str, char ch) {
		
		str.toUpperCase();
		Character.toUpperCase(ch);
		int answer = 0;
		for (char x : str.toCharArray()) {
			if(x == ch) answer ++;
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		char ch = kb.next().charAt(0);
		
		System.out.println(solution(str, ch));
	}

}
