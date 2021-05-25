package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요:");				
				
		float pi = 3.14f; //pi값은 두자리로 떨어지게 하려면 float 쓰고 끝에 f붙여줌
		
		float radius;     // 반지름은 radius
		
		radius = sc.nextFloat();		
		
				
		System.out.println("원의 넓이는 " + pi*radius*radius); //원의 넓이는 pi * 반지름 * 반지름
		
		sc.close();
		
		
	}

}
