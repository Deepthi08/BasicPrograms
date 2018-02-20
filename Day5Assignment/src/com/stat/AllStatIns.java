package com.stat;

public class AllStatIns {
	
	int i=10;
	int j=20;
	String str="deepthi";
	static int k=30;
	static int r=60;
	

	public static void main(String[] args) {
		AllStatIns obj = new AllStatIns();
		System.out.println(obj.i);
		System.out.println(obj.j);
        System.out.println(AllStatIns.k);
        System.out.println(AllStatIns.r);
        System.out.println(obj.str);
        
	}

}
