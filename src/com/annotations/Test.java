package com.annotations;

public class Test {

	public static void main(String[] args) {
		test();
	}
	
	@TestAnnotation
	private static void test() {
		System.out.println("Testing");
		// TODO Auto-generated method stub
		
	}

}
