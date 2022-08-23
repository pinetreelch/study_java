package com.pinetreelch.study.ch06;

public class ArithmethicOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticOperation arithmeticoperation = new ArithmeticOperation();
			
		int[] results = {arithmeticoperation.sum(1,2)
						, arithmeticoperation.deduct(1,2)
						,arithmeticoperation.multiply(1,2)
						,arithmeticoperation.divide(6,2)
						, arithmeticoperation.remainder(5,2)
						};
		
	
		for(int i = 0; i < results.length; i++) {
			arithmeticoperation.say(results[i]);	
		}
		
		arithmeticoperation.sentence("나는", " 배가 고프다");
	}
}
