package com.pinetreelch.study.ch07.eight;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int param = 7;
		String sentence = "Computer 객체의 원면적 구하는 프로그램 실행";
		
		Computer computer = new Computer();
		
		System.out.printf(sentence+ "\n"+"원면적: "+computer.area(param));
	}

}
