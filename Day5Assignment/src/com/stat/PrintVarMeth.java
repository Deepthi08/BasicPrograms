package com.stat;

public class PrintVarMeth {
	int i=10;
	int j=20;//instance variables
	static int r=75;
	static int k=67;
	public void m1() {
		System.out.println("i am instance method1");
	}
	public void m2() {
		System.out.println("i am instance method2");
	}
	public static void m3() {
		System.out.println("i am static method1");
	}
	public static void m4() {
		System.out.println("i am static method2");
	}
	public static void main(String[] args) {
			PrintVarMeth obj = new PrintVarMeth();
			obj.m1();
			obj.m2();
			PrintVarMeth.m3();
			PrintVarMeth.m4();
			System.out.println(PrintVarMeth.k);
			System.out.println(PrintVarMeth.r);
			System.out.println(obj.i);
			System.out.println(obj.j);
			
	}

}
