package com.pinetreelch.selfstudy.scanner.ch01;

public class Tes3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "!@@abcd@";
		
		char[] ch = str.toCharArray(); // 
		
		int lt = 0; 
		int rt = ch.length - 1;	

		while( lt < rt) {
		if( (ch[lt] >= 97 && ch[lt] <= 122) || (ch[lt] <= 90 && ch[lt] >= 65) ) { 	
			
				char tmp = ch[lt]; // 
					
					if( (ch[rt] >= 97 && ch[rt] <= 122) || (ch[rt] <= 90 && ch[rt] >= 65) ){
						
						ch[lt] = ch[rt];
						ch[rt] = tmp; 
						lt++;
						rt--;
						
						} else {
							rt--;
						}
			} else {
					lt++; 
				}
		}
		String a = String.valueOf(ch);
		System.out.println(a);
//				if( (ch[rt] >= 97 && ch[rt] <= 122) || (ch[rt] <= 90 && ch[rt] >= 65) ) { 
//					ch[lt] = ch[rt];
//					ch[rt] = tmp;
//				} 
//		}
		
	}

}
