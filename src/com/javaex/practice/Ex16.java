package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품가격: ");
		double price = sc.nextDouble();			//상품가격 입력
		
		System.out.print("받은돈: ");
		double money = sc.nextDouble();			//받은가격 입력
		
		System.out.println("====================================");
		//절취선ㅋ_ㅋ
		
		System.out.println("받은돈 :" + money);  //받은돈 출력
		System.out.println("상품가격: " + price);//상품가격 출력
		System.out.println("부가세: " + price / 10 ); //부가세 = 상품가격 / 10
		System.out.println("잔액: " + (money - price)); //잔액 = 받은돈 - 상품가격
		
		sc.close();

	}

}
