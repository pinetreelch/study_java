package com.pinetreelch.selfstudy.scanner.ch02;

import java.util.Scanner;

public class Palindrome {							//회문 문자열 문제
	
	public static String solution(String str) { 
		String answer = "YES" ;
		
	
		char[] ch = str.toUpperCase().toCharArray();
		
		int lt = 0;
		int rt = ch.length - 1;
		
		while(lt < rt) {
			
			if(ch[lt] == ch[rt] ) {
				lt++;
				rt--;
			} else {
				 answer = "NO";
				 break;
			}
			
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
//		문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
		
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		
		System.out.println(solution(str));


	}

}
