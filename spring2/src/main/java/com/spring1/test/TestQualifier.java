package com.spring1.test;

import javax.inject.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring1.dao.SampleDAO;
import com.spring1.dao.SampleDAOImpl;

public class TestQualifier {

	@Autowired
	@Qualifier("testDAO")
	private SampleDAO sampleDAO;
	
	public TestQualifier() {
		this.sampleDAO = new SampleDAOImpl();
	}
	
	
	
}
