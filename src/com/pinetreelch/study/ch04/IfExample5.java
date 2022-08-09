package com.pinetreelch.study.ch04;

public class IfExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int 타입의 변수를 2개 선언하고
		// 두 정수가 주어졌을 때 사분면 어디에 해당되는지 출력하는 프로그램을 작성하시오
		
		int x, y;
		x= 0;
		y= 0;
		
		if(x>0 & y>0) {
			System.out.println("1사분면");
		} else if(x<0 && y>0){
			System.out.println("2사분면");
		} else if(x<0 && y<0) {
			System.out.println("3사분면");
		} else if(x>0 && y<0) {
			System.out.println("4사분면");
		} else if (x == 0 && y!=0) {
			System.out.println("x,y는 x축 위에 있습니다");
		} else if(x!=0 && y == 0) {
			System.out.println("x,y는 y축 위에 있습니다");
		} else {
			System.out.println("x,y는 원점입니다.");
		}
	}

}
