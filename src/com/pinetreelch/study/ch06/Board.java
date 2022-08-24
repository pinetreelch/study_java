package com.pinetreelch.study.ch06;

public class Board {
	//field
	//제목, 작성자, 작성일, 조회
	
	String title ="";
	String writer= "";
	String date = "";
	int view = 0;
	Boolean use = true;
	
	//method
	// 글쓰기, 글 수정하기, 글 삭제하기, 댓글달기, 글 상세보기
	
	String[] sai = {"[이름 바꾸기]", "[이름, 조회수 바꾸기]", "[이름, 사용여부 바꾸기]", "[이름, 조회수, 사용여부 바꾸기]"};
	
	Board(){
		
	}
	
	Board(String writer){
		this.writer = writer;
	}
	
	Board(String writer,int view){
		this.writer = writer;
		this.view = view;
	}
	
	Board(String writer, Boolean use){
		this.writer = writer;
		this.use = use;
	}
	
	Board(String writer,int view, Boolean use){
		this.writer = writer;
		this.view = view;
		this.use = use;
	}
	
	public void say(int x) {
		
		if(use == false) {
			System.out.println("*******이 글은 사용중이 아닙니다!!********");
		} else {
			System.out.println("*******이 글은 사용중 입니다!!********");
		}
		System.out.println(sai[x]);
		System.out.println("글쓴이: " + writer+ " // "
							+" 조회수 :"+ view + " // "
							+ " 사용여부: "+ use);
		System.out.println();
	}
}
