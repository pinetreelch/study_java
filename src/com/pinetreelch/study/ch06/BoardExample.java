package com.pinetreelch.study.ch06;

public class BoardExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Board board = new Board();
		
		Board board1 = new Board("가");
		board1.say(0);
		
		Board board2 = new Board("나", 1);
		board2.say(1);
		
		Board board3 = new Board("다", false);
		board3.say(2);
		
		Board board4 = new Board("라", 2, true);
		board4.say(3);
	}
}
