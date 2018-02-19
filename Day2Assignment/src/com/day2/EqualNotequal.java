package com.day2;

public class EqualNotequal {
	public void equal() {
		int num1=10;
		int num2=20;
		if(num1==num2){
		System.out.println("The two numbers are equal");
		}
		else if (num1!=num2){
		System.out.println("The numbers are not equal");
		}
	}

	public static void main(String[] args) {
		EqualNotequal obj = new EqualNotequal();
		obj.equal();
	}
}
