package com.javaex.pratice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
				
		long lightspeed;  //빛 속도 변수
		lightspeed = 300000;//빛 속도
		
		long distance;  //거리
		distance = lightspeed * 365 * 24 * 60 * 60 ; 
		//빛의 1년 이동거리 공식 (빛속도 * 1년(365일) * (하루)시간 * 분 * 초
		
		
		
		
		System.out.println("빛이 1 년 동안 가는 거리는 " + distance +  " km 입니다.");

		sc.close();
		
		
	}

}
