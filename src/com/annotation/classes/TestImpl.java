package com.annotation.classes;

import com.annotation.interfaces.Testable;
import com.annotations.TestAnnotation;

public class TestImpl implements Testable<TestAnnotation> {

	@Override
	public void execute() {
		System.out.println("Working...");
		
	}

}
