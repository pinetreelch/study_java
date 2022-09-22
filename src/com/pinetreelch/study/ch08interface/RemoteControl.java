package com.pinetreelch.study.ch08interface;

public interface RemoteControl {
	
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메서드 - Television
	public abstract void turnOn();	
	void turnOff();
	void setVolume(int volume);

	//default  -그냥 함수 
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//static 메서드 
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
	
	
}
