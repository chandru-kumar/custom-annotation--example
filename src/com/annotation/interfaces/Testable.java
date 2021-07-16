package com.annotation.interfaces;

import java.lang.annotation.Annotation;

public interface Testable<A extends Annotation> {
	
	void execute();

}
