package com.spring1.myapp;

import java.text.DateFormat;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/", method = RequestMethod.Get)
	public String home(Locale locale, Model model) {
		log.info("welcome home! The Client locale {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.)
	}
}