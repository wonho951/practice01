package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		/*
		int x,y = 0;         		//x와 y를 모두 0으로 초기화
		char grade = "A";			//문자 A를 grade에 대입
		int salary = 2,000,000;		//salary에 2,000,000을 대입
		byte n = 1000;				//n에 1000을 대입
		*/
		
		int x,y = 0;         		//x와 y를 모두 0으로 초기화    --> x,y는 기본값 0으로 설정
		char grade = 'A';			//문자 A를 grade에 대입        --> char은 "" 아닌 ''사용
		int salary = 2000000;		//salary에 2,000,000을 대입    --> 정수만 가능하므로 , 제거
		long n = 1000;				//n에 1000을 대입              --> byte는 최대 숫자 127까지 가능하므로 short, int, long 사용
		
		
	}

}
