package com.pinetreelch.study.ch07.fourth;

import java.util.Arrays;

public class Class1 {
	
	int sum = 0;
	
	int[] sus = {7, 3, 5};

	void sort(int x, int y, int z) {
		this.sus[0] = x;
		this.sus[1] = y;
		this.sus[2] = z;
		Arrays.sort(sus);
		
		System.out.print("오름차순정리:");
		for(int c = 0; c < sus.length; c++) {
			System.out.print(sus[c]+",");
			if(c==2) {
				System.out.println();
			}
		}
	}
	
	public int summ(int x, int y, int z) {
		int result = sus[0]* sus[1] + sus[2];
		return result;
	}

}

