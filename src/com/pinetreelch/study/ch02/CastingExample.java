package com.pinetreelch.study.ch02;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//강제 형변환: casting : (원하는 형) 변수명
		
		double doubleValue = 1234567;
		System.out.println("doubleVlaue:"+ doubleValue);
		
		double doubleValue2 = 1234567891; // 7자리 이상인 경우에는 e로 표현됨. e는 10^9
		System.out.println("doubleValue2:"+ doubleValue2);
		
		// float 변수에 double 대입
		float floatValue = (float) doubleValue;
		System.out.println("floatvalue:"+ floatValue);
		
		//long <- float
		long longValue = (long) floatValue;
		System.out.println("longValue:"+ longValue);
		
		//int <-- long
		int intValue = (int) longValue;
		System.out.println("intValue:"+ intValue);
		
		//short <-- int
		short shortValue = (short) intValue;
		System.out.println("shortValue:"+ shortValue);
		
		//byte <-- short
		byte byteValue = (byte) shortValue;
		System.out.println("byteValue:"+ byteValue);
		
	
	
		//string을 int로 변환
		String stringvalue = "22";
		int stringInt = Integer.parseInt(stringvalue);
		
		System.out.println("stringInt: "+ stringInt);
	
		// int를 스트링으로 변환
		int int1 = 3;
		String intString = String.valueOf(int1);
		
		System.out.println("intString: "+ intString);
		
		//int, interger 차이: int는 원시 dt, integer은 참조형 dt.
	}
}
