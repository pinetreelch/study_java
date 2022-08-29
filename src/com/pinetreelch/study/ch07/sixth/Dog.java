package com.pinetreelch.study.ch07.sixth;

public class Dog extends Animal{
	public Dog() {
		this.kind ="포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("으르렁");
	}
	@Override
	public void sound(String m) {
		System.out.println("멍멍이는 멍");
	}
}
