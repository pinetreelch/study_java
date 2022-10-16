package com.pinetreelch.selfstudy.scanner.ch02;

import java.util.Scanner;

public class OnlyNumber {
	
	public static Integer solution(String str) {
		
		String x = str.replaceAll("[^0-9]", "");
		int ab = Integer.parseInt(x);
	
		return ab;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		
		System.out.println(solution(str));

	}

}
