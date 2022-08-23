package com.pinetreelch.study.ch06;

public class IphoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Iphone iph = new Iphone();
		Car car = new Car();
		Bags bags = new Bags();
		
		
		iph.show();
		System.out.println("iph.iphone[2] : "+iph.iphone[2]);
		System.out.println(car.name);
		System.out.println(bags.backpack[2]);
		
		car.name = "소나타";
		
		System.out.println(car.name);
	}

}
