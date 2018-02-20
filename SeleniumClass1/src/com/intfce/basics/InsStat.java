package com.intfce.basics;

public class InsStat {
	int a =10; // non static(or)instance
	static int b=20; //static variable
	public void m1() {
		System.out.println("Hi I am m1 Instance method");
	}
	public static void m2() {
		InsStat d = new InsStat();
		d.m1();
	}

	public static void main(String[] args) {
		InsStat d = new InsStat();
		d.m1();
		System.out.println(d.a);
		m2();
		/*InsStat.m2();
		 * System.out.println(InsStat.b);
		 */
	}

}
