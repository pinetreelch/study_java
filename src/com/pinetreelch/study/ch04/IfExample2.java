package com.pinetreelch.study.ch04;

public class IfExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 1500;
		double discount1 = 0.05;
		double discount2 = 0.1;
		double discount3 = 0.15;
		double discount4 = 0.2;
		double platinum5 = 0.27;
		
		int rank1 = 1;
		int rank2 = 2;
		int rank3 = 3;
		int rank4 = 4;
		int rank5 = 6;
		
		if(rank == 1) {
			System.out.println("정가"+price);
			System.out.println("일반은"+"할인가:"+(price*discount1));
		}else if(rank ==2) {
			System.out.println("정가"+price);
			System.out.println("브론즈은"+"할인가:"+(price*discount2));
		}else if(rank==3) {
			System.out.println("정가"+price);
			System.out.println("실버는"+"할인가:"+(price*discount3));
		}else if (rank ==4) {
			System.out.println("정가"+price);
			System.out.println("골드는"+"할인가:"+(price*discount3));
		}else if( rank ==5) {
			System.out.println("정가"+price);
			System.out.println("플레티넘"+"할인가:"+(price*discount2));
		}
		
	
		
	}

}
