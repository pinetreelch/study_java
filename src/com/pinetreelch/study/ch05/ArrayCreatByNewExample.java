package com.pinetreelch.study.ch05;

public class ArrayCreatByNewExample {

	public static void main(String[] args) {

		int[] arr1 = new int[3];
		
		int[] arr2;
		arr2 = new int[5];
		
		arr1[0] = 7;
		arr1[1] = 777;
		arr1[2] = 7777;
		
		arr2[0] = 7;
		arr2[1] = 77;
		arr2[2] = 777;
		arr2[3] = 7777;
		arr2[4] = 77777;
		
		System.out.println("arr[0] : "+arr1[0]);
		System.out.println("arr[0] : "+arr1[1]);
		System.out.println("arr[0] : "+arr2[3]);
		
		
		
	}
}
