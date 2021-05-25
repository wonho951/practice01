package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("마일을 입력하세요:");
				
		double mile = 1.609;    //1마일은 변하지 않으므로 상수로 지정
		
		double km;              //km 상수
			
		
		km = sc.nextInt();      //km 입력
		
				
		
		System.out.println(km + "마일은 " + mile*km + " 킬로미터 입니다.");
		
		sc.close();
		
	}

}
