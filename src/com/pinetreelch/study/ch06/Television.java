package com.pinetreelch.study.ch06;

public class Television {
	public static String company =" Samsun";
	public static String model ="oled";
	public static String info;
	
	public String version = "1.-";
	
	
	static {							// 아직 초기화 안된 static값만 초기화 가능 그래서 company + version은 에러가 뜸. version이 static이 아니기 때문.
		info = company + model;
		// info = company + version;
	} //이게 static Block임!
}
