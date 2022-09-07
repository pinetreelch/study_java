package com.pinetreelch.selfstudy.scanner.ch01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class FlipwordOnlyEng {

	public static ArrayList<String> solution(String str) {

		ArrayList<String> answer = new ArrayList<>();
		char[] ch = str.toCharArray(); // if @@abcd

		int lt = 0;
		int rt = ch.length - 1;

		
//		 while(lt < rt) { if((ch[lt] >= 97 && ch[lt] <= 122) || (ch[lt] <= 90 &&ch[lt] >= 65)) { 
//			 char tmp = ch[lt];
//			 
//			 if((ch[rt] >= 97 && ch[rt] <= 122) || (ch[rt] <= 90 && ch[rt] >= 65)) {
//				 	ch[lt] = ch[rt];
//				 	ch[rt] = tmp; 
//			} else { rt--; } } else { lt++; }
//		 }
		  
		while (lt < rt) {
			if( (ch[lt] >= 97 && ch[lt] <= 122) || (ch[lt] <= 90 && ch[lt] >= 65) ) {
				char tmp = ch[lt];
				
				if( (ch[rt] >= 97 && ch[rt] <= 122) || (ch[rt] <= 90 && ch[rt] >= 65) ) {
					ch[lt] = ch[rt];
					ch[rt] = tmp;
				} else {
					rt --;
				}
			} else {
				lt ++;
			}
		}
		
		String chString = String.valueOf(ch);

		answer.add(chString);

		return answer;
		

//		
//		while(lt<rt) {
//			
//			char tmp = ch[lt];
//			ch[lt] = ch[rt];
//			ch[rt] = tmp;
//			lt ++;
//			rt --;
//		}
//		


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		String str = kb.next();

		for (String x : solution(str)) {
			System.out.println(x);
		}

	}

}
