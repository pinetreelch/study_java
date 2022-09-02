package com.pinetreelch.study.ch07.eight;

public class Computer extends Calculator{
	
	
	@Override
	public double area(double param) {
		System.out.printf("원의 반지름: " + param + "\n"+"\n"
							+"Calculator 객체의 원면적 구하는 프로그램 실행"+ "\n"+"원면적: "+ super.area(param) + "\n" + "\n");
		double area = param * param * Constants.PAI_2;
		return area;
	}
}
