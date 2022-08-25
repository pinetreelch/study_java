package com.pinetreelch.study.ch07.first;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		// 부모 객체를 생성하고 poweron 메서드 실행
		CellPhone cellPhone = new CellPhone();
		cellPhone.powerOn();
		
		//자식 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		//자식 객체의 turnOffDmb 실행
		dmbCellPhone.turnOffDmb();
		
		//생성자를 이용하여 자식 객체 생성
		DmbCellPhone dmbCellPhone2 = new DmbCellPhone("아이폰14", "검정색", 5);
		
		//dmbCellPhone2 객체를 사용하여 자식 클래스의 함수 전체 호출
		dmbCellPhone2.turnOnDmb();
		dmbCellPhone2.changeChannelDmb(99);
		dmbCellPhone2.turnOffDmb();
		System.out.println("==================");
		dmbCellPhone2.powerOn();		
		dmbCellPhone2.powerOff();
		dmbCellPhone2.bell();
		dmbCellPhone2.sendVoice("나는");
		dmbCellPhone2.receiveVoice("치킨");
		dmbCellPhone2.hangup();
	} 

}
