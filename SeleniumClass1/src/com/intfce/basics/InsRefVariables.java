package com.intfce.basics;

public class InsRefVariables {
	int i;
	static InsRefVariables obj;
	public int a=10;
	float f=10.32f;
	public static String cname=" ";
	
	public void m1() {
		i=20;
		System.out.println("I am m1 method:"+ i);
	}
	public void m2() {
		i=40;
		System.out.println("I am m2 method:"+ i);
	}
	public static void main(String[] args) {
			obj=new InsRefVariables();
			obj.m1();
			obj.m2();
	}

}
