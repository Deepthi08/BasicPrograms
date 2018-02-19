package com.day2;

public class LogicalOperators {
	public void and() {
		int a=10;
		int b=11;
		int c=12;
		System.out.println(a<b&&a<c);//checks second condition, only if condition is true
	}
	public void or() {
		int i=5;
		int j=6;
		int k=8;
		System.out.println(i<j||i<k);//checks second condition only when 1st condition is false
	}
	public void logicalnot() {
		int a1=50;
		int a2=60;
		boolean result= a1<a2;
		boolean result1=!(a1<a2);
		System.out.println("result :"+result);
		System.out.println("result1 :"+result1);
	}

	public static void main(String[] args) {
      LogicalOperators obj = new LogicalOperators();
      obj.and();
      obj.or();
      obj.logicalnot();
	}

}
