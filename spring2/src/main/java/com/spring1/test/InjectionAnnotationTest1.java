package com.spring1.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InjectionAnnotationTest1 {


	@Autowired
	private InjectionAnnotation1 obj1;
	
	@Autowired
	private InjectionAnnotation2 obj2;
	
	@Autowired
	private InjectionAnnotation3 obj3;
	
	@Autowired
	private InjectionAnnotation4 obj4;

	
	
	
	
	
	
 }
