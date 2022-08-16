package com.pinetreelch.study.ch04;

import java.util.Random;

public class RandomSum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
	
	int num1 = rand.nextInt(100);
	int num2 = rand.nextInt(100);
	
	System.out.println(num1+" : "+ num2);
	int sum = 0;
	
	if(num1 > num2) {
		for(int i = num2 ; i <= num1; i++) {
			sum += i;
			System.out.print(i + " + ");
			if(i == num1) System.out.print(i + " ");
		}
		System.out.print(" = " + sum);
	} else {
		for(int i = num1 ; i <= num2; i++) {
			sum += i;
			System.out.print(i + " + ");
			if(i == num2) System.out.print(i + " ");
		}
		System.out.print(" = " + sum);
			System.out.println(num1 + " ~ " + num2 + " 사이의 합은 " + sum);
	}
	}
}

