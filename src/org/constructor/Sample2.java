package org.constructor;

public class Sample2 extends Sample{
	public Sample2(String name) {
		super();
		System.out.println("String Name: Parameter Constructor");
	}
	public Sample2(int b) {
		this("string");
		System.out.println("default constructor");
	}
	public Sample2() {
		this(2);
		System.out.println("DC");
	}
	public static void main(String[] args) {
		
	
	Sample2 s=new Sample2();
	}
}
