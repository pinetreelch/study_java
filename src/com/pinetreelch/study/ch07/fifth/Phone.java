package com.pinetreelch.study.ch07.fifth;

public abstract class Phone {
	
	//필드
	public String owner;
	
	//생성자
	
	Phone() {
		
	}
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 메소드
	public void turnOn() {
		System.out.println(owner + "가 폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
