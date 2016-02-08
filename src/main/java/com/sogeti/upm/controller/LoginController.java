package com.sogeti.upm.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sogeti.upm.model.States;

@RestController
public class LoginController {
	
	
	 @RequestMapping(value = "/pop", method = RequestMethod.POST)
	    public States greeting(@RequestBody States s) {
		  System.out.println(s.getStateName());
		  s.setStateName("changes");
		  return s;
	    }

}
