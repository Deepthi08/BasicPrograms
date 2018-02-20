package com.stat;

public class InsInStatMeth {
	

	public void m1() {
		System.out.println("Hi I am Instance method");
		
	}
	public static void m2() {
		InsInStatMeth obj = new InsInStatMeth();
		obj.m1();
		System.out.println("Hi I am Static Method");
		
	}
	
	public static void main(String[] args) {
		InsInStatMeth.m2();

	}

}
