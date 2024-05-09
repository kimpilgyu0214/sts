package com.spring1.test;

import com.spring1.dto.Market;

public class InjectionAnnotation3 {
	private int data;
	private String data2;
	private Market marketBean1;
	public InjectionAnnotation3(int data, String data2, Market marketBean1) {
		super();
		this.data = data;
		this.data2 = data2;
		this.marketBean1 = marketBean1;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public String getData2() {
		return data2;
	}
	public void setData2(String data2) {
		this.data2 = data2;
	}
	public Market getMarketBean1() {
		return marketBean1;
	}
	public void setMarketBean1(Market marketBean1) {
		this.marketBean1 = marketBean1;
	}
	
	
}
