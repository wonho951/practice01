package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월급을 입력하세요:");				
		
		int money = sc.nextInt(); // 월급 입력
		int year = money*10*12;   // 월급 * 년수 * 개월수 
		                          // 월급 * 년수만 하면 안됨(1년은 12개월이니까)
				
		System.out.println("10년동안 최대 저축액은" + year + "원"+" 입니다");
		sc.close();

	}

}
