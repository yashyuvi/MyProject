package org.constructor;

public class Sample3 {
	public Sample3() {
	    System.out.println("Default Parent Constructor");
	}

	public Sample3(int id) {
		System.out.println("Int Parent Para Constructor");
		System.out.println(id);
	}
	public Sample3(String Name) {
		System.out.println("String Parent Para Constructor");
		System.out.println("name");
	}
}
