package com.pinetreelch.selfstudy.scanner.ch01;

import java.util.Scanner;

public class FindLongestWord {
	
	public static String solution(String str) {
		String answer = "";
		
		int m = Integer.MIN_VALUE;
		String[] s = str.split(" ");
		
		for(String x : s) {
			int len = x.length();
			if(len > m) {
				m = len;
				answer = x;
			}
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
