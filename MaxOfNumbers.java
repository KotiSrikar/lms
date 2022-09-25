package com.te.learnjava8.basic;

public class MaxOfNumbers {
	public static void main(String[] args) {
		int a = 10;
		int b  = 50;
		int c = 35;
		int d = 42;
		int e = 46;
		
		
		int ref = Math.max(e, Math.max(d, Math.max(c, (Math.max(a, b)))));
		System.out.println("Max Number is: "+ref);
		
		int res = Math.min(e, Math.min(d, Math.min(c, Math.min(a, b))));
		System.out.println("Min Number is: "+res);
		
	}

}
