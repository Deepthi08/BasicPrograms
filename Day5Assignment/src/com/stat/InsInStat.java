package com.stat;

public class InsInStat {
	int i=80;
	int j=50;
	public static void m1() {
		System.out.println("I am static method");
	}

	public static void main(String[] args) {
		InsInStat obj = new InsInStat();
		InsInStat.m1();
		System.out.println(obj.i);
		System.out.println(obj.j);	
	}
}
