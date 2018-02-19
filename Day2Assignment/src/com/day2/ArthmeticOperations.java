package com.day2;

public class ArthmeticOperations {
	public void add() {
		int i=10;
		int j=40;
		int sum =i+j;
		System.out.println("addition:"+sum);
	}
	public void sub() {
		float f1=12.4f;
		float f2=13.5f;
		float f3=f1-f2;
		System.out.println("substraction:"+f3);
	}
	public void mul() {
		int a=10;
		int b=39;
		int c=a*b;
		System.out.println("multiplication:"+c);
	}
	public void div() {
		double d1=44.56;
		double d2=56.82;
		double d3=d1/d2;
		System.out.println("division:"+d3);
	}
	public static void main(String[] args) {
		ArthmeticOperations obj = new ArthmeticOperations();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
	}
}
