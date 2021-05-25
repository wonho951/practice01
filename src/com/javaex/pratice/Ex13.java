package com.javaex.pratice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("환전할 원화를 입력하세요:");
				
		double dollar = 1230.95;  // 1달러 = 1230.95
		 
		double exchange;          // 환전 변수
		
		int won;                  // 원화 변수
		
		won = sc.nextInt();       // 원화 입력
		 
		exchange = won / dollar;  // 환전 = 원화 / 달러
		
		
		
		System.out.println("받으실 달러는 " + exchange);
		
		sc.close();

	}

}
