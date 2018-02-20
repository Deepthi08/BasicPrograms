package com.stat;

public class StatInIns {
	static int i=30;
	static int j=20;
	public void m1() {
		System.out.println("I am Instance method");
	}

	public static void main(String[] args) {
		StatInIns obj = new StatInIns();
		obj.m1();
		System.out.println(StatInIns.i);
		System.out.println(StatInIns.j);

	}

}
