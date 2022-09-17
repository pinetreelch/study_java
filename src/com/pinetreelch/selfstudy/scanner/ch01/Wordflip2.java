package com.pinetreelch.selfstudy.scanner.ch01;

import java.util.ArrayList;
import java.util.Scanner;

public class Wordflip2 {
	
	public static ArrayList<String> solution(String str) {
		
		ArrayList<String> answer = new ArrayList<>();
		
		char[] ch = str.toCharArray();
		
		int lt = 0;
		int rt = ch.length - 1;
		
		 
		 //char[] ch = {a ,b, c};
		
		 while (lt < rt) {							// lt가 rt보다 작을때 계속 실행 -> lt가 rt보다 커지는 순간 while문 종료; 홀짝 둘다 가능;
			 
			 char tmp = ch[lt]; 					// tmp = a
			 
			 ch[lt] = ch[rt];  						// a become c  {c, b, c}
			 ch[rt] = tmp;							// { c, b, a}
			 lt++;									// lt값 증가
			 rt--;									// rt값 증가
		 }
		 String tmp = String.valueOf(ch);			// 앞뒤가 바뀐 배열 ch에 있는 값들을 합쳐서 String값으로 불러옴
		 answer.add(tmp);							// 가변적인 배열 ArrayList에 추가
	
		
		return answer;						
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		
		for(String s : solution(str)) {
			System.out.println(s);
		}			
	}

}
