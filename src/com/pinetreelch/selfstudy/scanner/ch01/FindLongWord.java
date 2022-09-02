package com.pinetreelch.selfstudy.scanner.ch01;

import java.util.Scanner;

public class FindLongWord {
	
	public static String solution (String str) {
		String answer = "";
		String[] sts = str.split("");
		
		int a = Integer.MIN_VALUE;
		
		for(String x : sts) {
			if(x.toCharArray().length>a) {
				x = answer;
				a = x.length();
			} else {
				a = x.length();
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
