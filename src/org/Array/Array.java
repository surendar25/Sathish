package org.Array;

public class Array {
	public static void main(String[] args) {
		int a[]= new int[5];
		a[4]=20;
		a[2]=10;
		a[0]=20;
		a[1]=50;
		a[3]=70;
		// To find length
		int b=a.length;
		System.out.println(b);
		// To find particular value
		System.out.println(a[1]);
		
		System.out.println("Print based on index");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		System.out.println("Print based on values");
		for (int x : a) {
			System.out.println(x);
			
		}
		}
	}
	
	
}
