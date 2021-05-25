package com.javaex.practice;

public class Ex07 {

	public static void main(String[] args) {
		
		int i = 10;
		int n = ++i %2; 
		
		
		System.out.println(i);
		System.out.println(n);
		
		// ex06의 결과로 봤을때 i가 먼저 출력되고 그 후에 n 출력이므로
		// i의 값이 먼저 1 증가해서 11출력후 % 인식해서 몫은 1 출력될듯?
	}

}
