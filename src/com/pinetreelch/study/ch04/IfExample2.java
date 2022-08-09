package com.pinetreelch.study.ch04;

public class IfExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int price = 10000;
		double discount1 = 0.05;
		double discount2 = 0.1;
		double discount3 = 0.15;
		double discount4 = 0.2;
		double discount5 = 0.027;
		//price*(1-discount1) -> 미리 변수로 만들어줘도 괜찮음
		
		int rank= 2; 	
		
		if(rank == 1) {
			System.out.println("정가"+price);
			System.out.println("일반은"+"할인가:"+(int)(price*(1-discount1)));
		}else if(rank ==2) {
			System.out.println("정가"+price);
			System.out.println("브론즈은"+"할인가:"+(int)(price*(1-discount2)));
		}else if(rank==3) {
			System.out.println("정가"+price);
			System.out.println("실버는"+"할인가:"+(int)(price*(1-discount3)));
		}else if (rank ==4) {
			System.out.println("정가"+price);
			System.out.println("골드는"+"할인가:"+(int)(price*(1-discount4)));
		}else if(rank == 5){
			System.out.println("정가"+price);
			System.out.println("플레티넘"+"할인가:"+(int)(price*(1-discount5)));
		}else {
			System.out.println("1~5까지의 grade만 가능합니다.");
		}
	}
}
