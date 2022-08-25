package com.pinetreelch.study.ch07.second;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 명시적 생성자를 사용하여 객체를 생성하고
		// 모든 필드를 출력하시요
		
		Student student = new Student("김철수", "ssn이 뭐지?",125);
		System.out.println("이름: "+ student.name + ", "+ "ssn: "+ student.ssn+ ", "+ student.studentNo);
		
		Student student2 = new Student("박철민", "ssn이 뭐지??");
		System.out.println("이름: "+ student2.name + ", "+ "ssn: "+ student2.ssn+ ", "+ student2.studentNo);
	}

}
