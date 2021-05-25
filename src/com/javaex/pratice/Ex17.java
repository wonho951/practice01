package com.javaex.pratice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 : ");
		
		double radius = sc.nextInt(); //반지름 입력
		
		double pi = 3.14; //pi= 3.14 상수
		
		double V =  (double)4/ (double)3*pi*radius*radius*radius; // 구의 부피는 V = 4/3 * pi * radius * radius * radius   
		
		// 첨에 앞에 double안붙였는데 4/3 두 숫자 정수로 인식해서 계산식 다르게 출력됨
		// pi 값이 double니까 4와 3도 각각 double 붙이는것 같다.그럼 문제랑 출력 같게 나옴.
		
		System.out.println("구의 부피는 : " + V + " 입니다.");
		
		
		sc.close();
		
		
	}

}
