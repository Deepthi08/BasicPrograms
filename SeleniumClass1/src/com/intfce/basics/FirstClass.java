package com.intfce.basics;

public class FirstClass implements FirstInterface {
	int a=10;
	float f=10.2f;
	public void m1() {
		System.out.println("Hi I am m1 method");
	}
	public void m2() {
		System.out.println("Hi I am m2 method");
	}
	public static void main(String[] args) {
               FirstClass fc = new FirstClass();
               fc.m1();
               fc.m2();
               fc.m3();
               System.out.println(fc.a);
               System.out.println(fc.f);
	}
	@Override
	public void m3() {
			System.out.println("Hi I am updated m3 method in child class");
	}
	}
