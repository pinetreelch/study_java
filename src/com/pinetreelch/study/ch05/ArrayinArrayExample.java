package com.pinetreelch.study.ch05;

public class ArrayinArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] scores= {{99,1,55},{55,2,66},{55,3,44},{55,4,44},{55,5,77}};
		
		//System.out.println("scores[1][1] : "+ scores[4][1]);
		
		//장원영 중간고사, 장동건 중간고사, 고서영 중간고사, 
		
		//장원영 중간고사 결과
		
		//국어, 영어, 수학
		
		double korsum = 0;
		double engsum = 0;
		double mathsum = 0;
		
		double[] total = new double[5]; 
		total[0]= 0;
		total[1]= 0;
		total[2]= 0;
		total[3]= 0;
		total[4]= 0;
		//과목별 평균
		for(int x = 0; x <= 4; x++ ) {
				System.out.println((x+1)+"번 학생 ");
				for(int y = 0; y <= 2; y++) {
					System.out.println((y+1)+"번 과목 점수: "+ scores[x][y]);
					if(y==0) {
						korsum = korsum+ scores[x][y];
					} else if (y ==1) {
						engsum = engsum + scores[x][y];
					}else {
						mathsum = mathsum + scores[x][y];
					}
					total[x] = total[x] +scores[x][y];
					
					if(y==2) {
						System.out.println((x+1)+"번 학생 평균 = "+ (total[x])/3 );
						System.out.println();
						}
				}
		}
		
		System.out.println("전체성적 평균 = "+ (korsum+engsum+mathsum)/15);
		System.out.println("국어 성적 평균 = "+ (korsum)/scores.length);
		System.out.println("영어 성적 평균 = "+ (engsum)/scores.length);
		System.out.println("수학 성적 평균 = "+ (mathsum)/scores.length);
	}
}
