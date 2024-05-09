package com.spring1.controller;

import org.apache.catalina.Store;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class RestfulController {
	
	@GetMapping("/api1/")
	public store getApi() {
		Store store = new Store(1, "EmArt");
		return store;
	}

	@GetMappping("api3.do)"
	public List<Store> getApi3() {
		
	}
		
}
