package com.pinetreelch.study.ch03;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ++/-- 피연산자: 다른 연산 수행 전에 피연산자 1증가/감소
		//  피연산자 ++/--: 다른 연산 수행 후에 피연산자 1증가/감소
		
		int i = 0;
		int j = 0;
		
		++i;
		j++;
		
		System.out.println("i: "+i);
		System.out.println("J: "+ j);
		
		//int 변수 a, b를 선언하고 초기값으로 1을 넣어둔다.
		//a 앞에 앞에 감소연산
		//b 에 앞에 감소연산
		//두 변수의 결과를 출력
		
		int a =1;
		int b=1;
		
		--a;
		b--;
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		
		//int 변수 k 선언 후 초기값으로 i 뒤에 증감연산
		
		int k = i++;  //1
		System.out.println("K: "+ k);
		System.out.println("I: "+ i);
		
		//i=2
		int m = ++j;
		
		System.out.println("M: "+m);
		System.out.println("j: "+j);
		//j=2
		int z = ++i + j++;
		//i=3 j=2 z=5
		System.out.println("z: "+z);
		System.out.println("i: "+i);
		System.out.println("J: "+j);
		
		
		
	}

}
