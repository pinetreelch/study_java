package com.pinetreelch.study.ch04;

public class MultiplicationExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int a = 2; a <= 9; a ++ ) {
			System.out.println(a+"단");
			for(int b = 1; b <= 9; b ++) {
				System.out.println(a+" * "+ b + " = "+ a*b);
				if(b == 9) {System.out.println("-----------");}
			}
		}
	}

}
