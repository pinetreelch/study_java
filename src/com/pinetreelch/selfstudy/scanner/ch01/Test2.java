package com.pinetreelch.selfstudy.scanner.ch01;

import java.util.Scanner;

public class Test2 {
	public static String soulution(String str) {
		
		
		char[] ch = str.toCharArray();
		
		String answer = String.valueOf(ch);
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb =new Scanner(System.in);
		
		String str = kb.next();
		System.out.println(soulution(str));
	}

}
