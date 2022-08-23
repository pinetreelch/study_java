package com.pinetreelch.study.ch06;

public class CarSecondExample {

	public static void main(String[] args) {
		
		CarSecond carSecond = new CarSecond();
//		String color;
		carSecond.say(0);
		
		CarSecond carSecond1 = new CarSecond("아방이1");
		carSecond1.say(1);
	
		CarSecond carSecond2 = new CarSecond("아방이2", 2000);
		carSecond2.say(2);
		
		CarSecond carSecond3 = new CarSecond("아방이3", 3000, "black");
		carSecond3.say(3);
		
		CarSecond carSecond4 = new CarSecond();
		CarSecond carSecond5 = new CarSecond(3000, "G80");  // !!!오버로딩: 함수는 같은데 데이터형이 계속 달라지는것; (생성자 오버로딩) 함수 같은데 매개변수 갯수랑 위치에 따라 기능 구별이 가능한것!!!!!!!!

//		System.out.println("carSecond.color: "+carSecond.color);
//		System.out.println("carSecond2.color: "+carSecond2.color);
//		System.out.println("carSecond2.cc: "+carSecond2.cc);
//		
//		System.out.println("carSecond3.color: "+carSecond3.color);
//		System.out.println("carSecond3.cc: "+carSecond3.cc);
	}

}
