package com.pinetreelch.study.ch05;

public class EnumWeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Week abc;
		
		abc = Week.Monday;
		
		System.out.println(Week.Friday);
		System.out.println(abc);
		
		String name= abc.name();
		
		System.out.println(name);
		
		int ordinal = abc.ordinal();
		System.out.println(ordinal);
		
		Week xyz = Week.Thursday;
		
		int result1 = abc.compareTo(xyz);
		int result2 = xyz.compareTo(abc);
		
		System.out.println(result1);
		System.out.println(result2);
		
		Week[] days = Week.values();
		
		int index = 0;
		
		for(Week day: days) {
			System.out.println(index + " : day: " + day);
			index ++;
		}
		
				
	}

}
