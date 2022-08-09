package com.pinetreelch.study.ch04;

public class IfExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int 타입의 변수를 3개 선언하고
		// 세 정수중에서 최대값 최소값을 구하는 프로그램을 작성하시오
		
		int x, y, z;
		x= 7;
		y=7;
		z=7;
		
		if(x>y) {
			if(x>z) {
				if(y>z) {
					System.out.println("최대값은"+"x:" +x + "입니다");
					System.out.println("최소값은"+ "z:"+z + "입니다");
				}else if(y ==z){
					System.out.println("최대값은"+ "x:"+x + "입니다");
					System.out.println("최소값은"+ "z:"+z +"와 y:" +y+ "입니다");
				}
				else{
					System.out.println("최대값은"+ "x:"+x + "입니다");
					System.out.println("최소값은"+ "z:"+z + "입니다");
				}
			}
		} else if (y>z) {
			if(y>x) {
				if(x>z) {
					System.out.println("최대값은"+"y:"+ y + "입니다");
					System.out.println("최소값은"+ "z:"+z + "입니다");
				}else if(x ==z){
					System.out.println("최대값은"+ "y:"+y + "입니다");
					System.out.println("최소값은"+ "x:"+x +"와 z:" +z+ "입니다");
				} else {
					System.out.println("최대값은"+ "y:"+y + "입니다");
					System.out.println("최소값은"+ "x:"+x + "입니다");
				}
			}
		} else if(x==y && y==z){
					System.out.println("값이 동일합니다");
		} else {
				if(x==y) {
						System.out.println("최대값은"+"z:"+ z + "입니다");
						System.out.println("최소값은"+ "x:"+x +"와 y:" +y+ "입니다");
				} else {
					System.out.println("최대값은"+ "z:"+z + "입니다");
					System.out.println("최소값은"+ "x:"+x + "입니다");
					}
		}				
	}
}
