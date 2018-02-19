package com.day2;

public class IncDec {
	public void increment(){
		int num1=10;
		int num2=20;
		num1++;
		num2++;
		System.out.println("increment values:"+ num1);
		System.out.println("increment values:"+ num2);

	}
	public  void decrement() {
		int num3=100;
		int num4=200;
		num3--;
		num4--;
		System.out.println("decrement values:"+ num3);
		System.out.println("decrement values:"+ num4);

	}
	public static void main(String[] args) {
		IncDec obj = new IncDec();
		obj.increment();
		obj.decrement();
	}

}
