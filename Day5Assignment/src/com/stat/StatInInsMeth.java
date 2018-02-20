package com.stat;

public class StatInInsMeth {
	
	public void m1() {
		System.out.println("Hi I am Instance method");
		StatInInsMeth.m2();
		
	}
	public static void m2() {
		int i=10;
		int j=20;
		int c=i+j;
		System.out.println("Static Addition:"+c);
	}

	public static void main(String[] args) {
		StatInInsMeth obj = new StatInInsMeth();
		obj.m1();
		

	}

}
