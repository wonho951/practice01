package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int x = 1;          //x=1
		int y = 2;          //y=2
		
		int a = ++x *2;
		// x값은 1인데 ++연산자때문에 1이 증가되므로 x=2 , *2하면 4
		int b = y++ *2;
		// y값은 2, n++연산자이므로 가장 마지막에 출력되니 y값은 한참후에 1증가함, *2하면 2출력 후 +1 더해지므로 3 
		System.out.println("a=" + a);   //a=4
		System.out.println("b=" + b);   //b=3
		System.out.println("x=" + x);   //x=2
		System.out.println("y=" + y);   //y=3
	}

}
