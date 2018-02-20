package com.intfce.basics;

public class ChildClass extends FirstAbstract {

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.m4();
		obj.m5();
	}

	@Override
	public void m5() {
		System.out.println("Hi I am overriden m5 method");
		
	}

}
