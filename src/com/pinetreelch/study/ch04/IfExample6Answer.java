package com.pinetreelch.study.ch04;

public class IfExample6Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		a= 1;
		b= 2;
		c= 3;
		
		if(a !=b && b != c && c != a) {
			if (a > b && a > c) {
				System.out.println("최대값은 a:"+ a);
			} else if (b > a && b > c) {
				System.out.println("최대값은 b:"+ b);
			} else {
				System.out.println("최대값은 c:"+ c);
			}
		
		
		if(a <b && a < c) {
			System.out.println("최소값은 a:" +a);
		} else if(b < a && b <c) {
			System.out.println("최소값은 b:"+ b);
		} else {
			System.out.println("최소값은 c:"+ c);
		}}
		else {
		System.out.println();	
		}
	}
}
