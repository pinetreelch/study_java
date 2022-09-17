package com.pinetreelch.selfstudy.scanner.ch01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class FlipwordOnlyEng {

	public static String solution(String str) {

		String answer;
		
		char[] ch = str.toCharArray(); // @abcd@
		
		// ch[0] = @
		// ch[1] = a
		// ch[2] = b
		// cd[3] = c
		// cd[4] = d
		// cd[5] = @
		
		// char[] ch = {@, a, b, c, d, @};
		//ch.length = 6;
		
		int lt = 0; // 1
		int rt = ch.length - 1;	//5

		  
		while (lt < rt) {
			if( (ch[lt] >= 97 && ch[lt] <= 122) || (ch[lt] <= 90 && ch[lt] >= 65) ) { 		//ch[lt] = @ ch[lt] = a 
				char tmp = ch[lt];				// ch tmp = ch[lt] = char = a;  -> char tmp = a;
					
				if( (ch[rt] >= 97 && ch[rt] <= 122) || (ch[rt] <= 90 && ch[rt] >= 65) ) { //ch[5] = @ -> false
					ch[lt] = ch[rt];
					ch[rt] = tmp;
					
					lt++;
					rt--;
				} else {
					rt --;	
				}
			} else {
				lt ++; 
			}
		}

		
		answer = String.valueOf(ch);
		
		return answer;
		



	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		String str = kb.next();		
		System.out.println(solution(str));

	}

}
