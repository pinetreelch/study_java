package com.pinetreelch.study.ch04;

public class SwitchExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade =3;
		
		int price = 10000;
		
		double discount1 = 0.05;
		double discount2 = 0.1;
		double discount3 = 0.15;
		double discount4 = 0.2;
		double discount5 = 0.027;
				
		switch (grade) {
			case 1:
				System.out.println("정가"+price);
				System.out.println("일반은"+"할인가:"+(int)(price*(1-discount1)));
				break;
			case 2:
				System.out.println("정가"+price);
				System.out.println("브론즈은"+"할인가:"+(int)(price*(1-discount2)));
				break;
			case 3:
				System.out.println("정가"+price);
				System.out.println("실버는"+"할인가:"+(int)(price*(1-discount3)));
				break;
			case 4:
				System.out.println("정가"+price);
				System.out.println("골드는"+"할인가:"+(int)(price*(1-discount4)));
				break;
			case 5:
				System.out.println("정가"+price);
				System.out.println("플레티넘"+"할인가:"+(int)(price*(1-discount5)));
				break;
			default:
				System.out.println("1~5까지의 grade만 가능합니다.");
				break;
		}
	}

}
