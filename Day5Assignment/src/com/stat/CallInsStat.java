package com.stat;

public class CallInsStat {
	public void m1() {
		System.out.println("I am Instance method");
	}
  static int add(int a, int b) {
	  int c=a+b;
	  return c;
	 
  }
	public static void main(String[] args) {
	CallInsStat obj = new CallInsStat();
	obj.m1();
	System.out.println(CallInsStat.add(10, 20));
	System.out.println(add(30,50));
	System.out.println(obj.add(40, 30));
	}

}
