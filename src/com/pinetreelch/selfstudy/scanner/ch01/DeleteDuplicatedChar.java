package com.pinetreelch.selfstudy.scanner.ch01;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteDuplicatedChar {
	
	public static String solution(String str) {
		String answer = "";
		
		char[] ch = str.toCharArray();
		ArrayList<Character> chh = new ArrayList<>();
		// 문제의 핵심은 배열에 기존에 없으면 추가하게 만들어야함;
		// 지금 차르 베열과 들어가있는 새로 만든 비어있는 배열안에 있는 값을 비교해야함;
		// 비교 후 비어있다면 추가
		
		int i = 0;
		
		for(char c : ch) { 											// ch배열안에 재료들을 순서대로 읽어라
			for(int x = 0; x < chh.toArray().length ; x++) {
					while(i <= chh.toArray().length) {
						
					}
			}
									
		}
		
		return answer;
		
		// int rt = ch.length; // 6 0 ~ 5
//		for(char c : ch) {
//			chh.add(c);
//		}
		
//		for(char c : ch) {
//			int lt = 0;
//			int rt = 0;
//			
//			while (lt <= 5  && rt < 2) {	//aabbcc
//				if(c == ch[lt]) {
//					chh.add(c);
//					lt++;
//					rt++;
//				}
//			}
//		}
		
		
//		int x = 0;
//		
//		while ( x <= ch.length) {
//			int lt = 0;
//			int rt = 0;
//			
//			for(char c : ch) {	//aabbcc
//					if(ch[lt] == c) {
//						rt++;
//						chh.add(c);
//						if(rt == 1) {
//							break;
//							}
//					}
//			}
//			x++;
//		}
		
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		System.out.println(solution(str));			//aabbcc
	}

}
