package com.spring1.vo;

import com.spring1.dto.Store;

public class InjectionJava {
	private Store store;

	public InjectionJava(Store store) {
		super();
		this.store = store;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}
	
	

}
