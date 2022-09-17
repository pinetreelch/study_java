package com.pinetreelch.selfstudy.scanner.ch01;

import java.util.ArrayList;
import java.util.Scanner;

public class WordflipReal {
	
	public static ArrayList<String> solution(String str){
		
		ArrayList<String> answer = new ArrayList<>();
		
		char[] ch = str.toCharArray();
		
		int lt = 0;
		int rt = ch.length -1;
		
		while(lt<rt) {
			
			char tmp = ch[lt];
			
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb =new Scanner(System.in);
		String str = kb.next();
		
		for(String x : solution(str)) {
			System.out.println(x);
		}
	}

}
