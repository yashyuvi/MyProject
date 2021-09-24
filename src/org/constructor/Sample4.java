package org.constructor;

public class Sample4 extends Sample3{
	public Sample4() {
		super(200);
		System.out.println("Default Child Constructor");
	}
	public Sample4(int id) {
		System.out.println("Int Child Para Constructor");
		System.out.println(id);
	}
	public static void main(String[] args) {
		Sample4 s4=new Sample4();
		Sample4 s5=new Sample4(100);
	}
	

}
