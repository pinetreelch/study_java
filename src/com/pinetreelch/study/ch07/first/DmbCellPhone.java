package com.pinetreelch.study.ch07.first;

public class DmbCellPhone extends CellPhone{
//자식
	int channel;
	
	
	DmbCellPhone() {
	
	}
	
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	 void turnOffDmb() {
		System.out.println("전원을 끕니다");
	}
	 
	 void changeChannelDmb(int channel) {
		 System.out.println("채널"+ channel+"번으로 바꿉니다.");
	 }
	
	 void turnOnDmb() {
	System.out.println("채널"+ channel +"번 Dmb방송 수신을 시작합니다.");
	}
	
}
