package com.pinetreelch.study.ch05;

public class ArrayExampleAns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score= {{99,1,55},{55,2,66},{55,3,44},{55,4,44},{55,5,77}};
		String name[] = {"장동건", "김소영", "박진용", "고서영", "김건모"};
		String subject[] = {"국어", "영어", "수학"};
		// 1 < -> 5 바꾸기
		//개인별 평균
		for(int i = 0; i < score.length; i ++) {
			int sum = 0;
			
			for(int j = 0; j <= 2; j++) {
				sum = sum + score[i][j];
			}
			System.out.println(name[i]+"의 점수는"+ sum);
		}
		
		for(int i = 0; i <=2; i++) {
			int sum = 0;
			for(int j = 0; j <= 4; j++) {
				sum = sum+ score[j][i];
				System.out.println(subject[i]);
			}
		}
	}

}
