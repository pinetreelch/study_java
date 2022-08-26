package com.pinetreelch.study.ch07.third;

public class Computer extends Calculator {

//	@Override
//	public double areaCircle(double r) {
//		// TODO Auto-generated method stub
//		return super.areaCircle(r);
//	}
	
@Override
	public double areaCircle(double r) {
	System.out.println("Computer 객체의 areaCircle 실행");
	return Math.PI * r * r;	
	}
	
	
}
