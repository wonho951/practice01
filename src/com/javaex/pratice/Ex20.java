package com.javaex.pratice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수:");
		int fiveh = sc.nextInt();//500원 개수 입력
		
		System.out.print("100원 개수:");
		int oneh = sc.nextInt();//100원 개수 입력
		
		System.out.print("50원 개수:");
		int fifty = sc.nextInt();//50원 개수 입력
		
		System.out.print("10원 개수:");
		int ten = sc.nextInt();//10원 개수 입력
		
		
		int sum = (fiveh*500) + (oneh*100) + (fifty*50) + (ten*10);
		//동전 총합 500원*갯수 + 100원*갯수 + 50원*갯수 + 10원*갯수 
		
		System.out.println("동전의 총합은 " + sum +  " 원 입니다.");
		
		sc.close();
	}

}
