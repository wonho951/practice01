package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		int i = 10;
		int n = i++ %2; 
		// % 먼저 계산해서 10/2의 몫은 0 후에 ++되므로 결과 1?
		
		System.out.println(i);
		System.out.println(n);
	}

}
