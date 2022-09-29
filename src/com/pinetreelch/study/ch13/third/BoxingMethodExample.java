package com.pinetreelch.study.ch13.third;

public class BoxingMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box = new Box<String>();
		
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int rtInt = box1.get();
		
		System.out.println("rtInt: " + rtInt);
		
		Box<String> box2 = Util.<String>boxing("Tony");
		String rtString = box2.get();
		
		System.out.println("rtString: " + rtString);
	}

}
