package com.pinetreelch.study.ch06;

public class HyundaiCarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HyudaiCar hyundaicar = new HyudaiCar();
		
		for(int i = 0; i < hyundaicar.carName.length; i ++) {
			System.out.println((i+1)+"번 :"+hyundaicar.carName[i]);
		}
	}

}
