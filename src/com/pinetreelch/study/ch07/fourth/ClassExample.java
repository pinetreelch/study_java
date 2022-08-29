package com.pinetreelch.study.ch07.fourth;

public class ClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int q,w,e;
	q=3;
	w=2;
	e=1;
	 int receive1, receive2;
	
	 Class1 class1 = new Class1();
	 class1.sort(q,w,e);
	 receive1= class1.summ(q, w, e);
	 System.out.println("오버라이드전: "+ receive1);
	 System.out.println("==============================");
	 
	 ClassChild classchild = new ClassChild();
	receive2= classchild.summ(q, w, e);
	System.out.println("오버라이드후: "+ receive2);
	System.out.println("==============================");

	 System.out.println("오버라이드 전후 차이: "+ Math.abs(receive1- receive2));
	}

}
