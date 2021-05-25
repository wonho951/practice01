package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로를 입력하세요:");
		double wide;			//가로 변수
		wide=sc.nextDouble();	//가로 값 입력
		
		System.out.print("세로를 입력하세요:");
		double height;			//세로 변수
		height=sc.nextDouble(); //세로 값 입력
		
		System.out.println("사각형의 넓이는: " + wide*height); 
		//직사각형 넓이는 가로*세로
		
		
		System.out.println("사각형의 둘레는: " + (wide+height) * 2);
		//직사각형둘레는 (가로*세로)*2
		 
		sc.close();
	}

}
