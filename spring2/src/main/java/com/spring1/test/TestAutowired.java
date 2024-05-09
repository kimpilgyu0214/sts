package com.spring1.test;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring1.dao.SampleDAO;

public class TestAutowired {

	
	@Autowired
	private SampleDAO sampleDAO;

	public TestAutowired() {
		this.sampleDAO = new sampleDAOImpl();
	}	
}
