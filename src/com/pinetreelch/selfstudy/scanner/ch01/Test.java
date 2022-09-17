package com.pinetreelch.selfstudy.scanner.ch01;

import java.util.Scanner;

public class Test {

	public static String solution(String str) {

		String answer;
		
		char[] ch = str.toCharArray(); 			//{a, b, c, d}

		int lt = 0;
		int rt = ch.length - 1;  // 0 ~ 3

	
		while (lt < rt) {
			if( (ch[lt] >= 97 && ch[lt] <= 122) || (ch[lt] <= 90 && ch[lt] >= 65) ) {
				lt++;												// lt = 1;
			}
			else if( (ch[rt] >= 97 && ch[rt] <= 122) || (ch[rt] <= 90 && ch[rt] >= 65) ) {
				rt--;					
			}
			char tmp = ch[lt]; // tmp = b;
			ch[lt]=ch[rt]; 		// b < - > d  ================>  {a, d, c, a}
			ch[rt]=tmp;			// ch[rt] = b ==> b ===========> {a, d, c, b} 
			lt++;				// lt = 2;
			rt--;				// rt = 2;
		}
		
		answer = String.valueOf(ch);
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		String str = kb.next();
		
		System.out.println(solution(str));			// abcd

	}

}