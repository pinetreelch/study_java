package com.pinetreelch.study.ch06;

public class CarSecond {

	String color = "red";
	int cc = 1500;
	String name = "아방이";
	
//	CarSecond(String str, int num){
//		color = str;
//		cc = num;
//	}
//	
	String[] sengsung = {"기존값", "이름만 바꿨을 때", "아룸 cc 바꿀때", "이름 cc color 바꿨을 때"};
	
	
	
	CarSecond(String name){
		this.name = name; // this는 상위(속한) 객체를 가르킨다.
		
	}
	
	CarSecond(String name, int cc){
		this.name = name;
		this.cc = cc;
	}
	
	CarSecond(String name, int cc, String color){
		this.name = name;
		this.cc = cc;
		this.color = color;
	}
	
	CarSecond(int cc){
		this.cc= cc;
	}
	
	CarSecond(int cc, String name){
		this.cc= cc;
		this.name = name;
	}
	 CarSecond() {

	}
	
	 public void say(int x){
		 System.out.println(sengsung[x]);
		 System.out.println("======================");
		 System.out.println("차이름: "+ name);
		 System.out.println("cc: "+ cc);
		 System.out.println("color : "+ color);
		 System.out.println();
		 System.out.println();
	 }
}
