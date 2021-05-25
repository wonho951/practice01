package com.javaex.pratice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("화씨 : ");
		double f = sc.nextDouble();  //화씨입력
		
		double c = (double)5/ (double)9*(f-32);  
		//17번이랑 똑같음. f를 double로 선언했으니 5랑 9도 double줘야 계산 제대로 함.
		
		System.out.println("화씨" + f + " 의 섭씨온도는 " + c + " 입니다.");

		
		sc.close();
	}

}
