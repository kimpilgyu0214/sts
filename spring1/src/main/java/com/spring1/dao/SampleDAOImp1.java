package com.spring1.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring1.dto.Sample;

@Repository
public class SampleDAOImp1 implements SampleDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Sample> getSampleList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("sample.getSampleList");
	}

	@Override
	public Sample getSample(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insSample(Sample sample) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upSample(Sample sample) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delSample(Sample sample) {
		// TODO Auto-generated method stub
		
	}

	
	
}	
