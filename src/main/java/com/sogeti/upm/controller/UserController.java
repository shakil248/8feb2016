package com.sogeti.upm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sogeti.upm.model.States;
import com.sogeti.upm.model.User;
import com.sogeti.upm.service.StatesService;
import com.sogeti.upm.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	StatesService statesService;
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	   public String  printHello() {
		statesService.populateStates();	     
		return "index";
	   }
	
	 @RequestMapping(value = "/user/", method = RequestMethod.GET)
	    public ResponseEntity<List<User>> listAllUsers() {
	        List<User> users = null;
//	        if(users.isEmpty()){
//	            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
//	        }
	        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	    }
	 
	 @RequestMapping(value = "/states", method = RequestMethod.GET)
	    public ResponseEntity<List<States>> getStates() {
	        List<States> states = statesService.getStates();
	        System.out.println(states);
	        return new ResponseEntity<List<States>>(states, HttpStatus.OK);
	    }
	 
	 @RequestMapping(value = "/user", method = RequestMethod.POST)
	    public @ResponseBody ResponseEntity<Void> createUser(@RequestBody User user) {
	        System.out.println("Creating User " +user.getEmailId());
	        user.setLoginId(null);
//	        if (userService.isUserExist(user)) {
//	            System.out.println("A User with name " + user.getUsername() + " already exist");
//	            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
//	        }
	        userService.createUser(user);
	  
	        HttpHeaders headers = new HttpHeaders();
//	        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getEmailId()).toUri());
	        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	    }
	  
	 	@RequestMapping(value = "/poster", method = RequestMethod.POST)
	 	public void poster(@RequestBody String str){
	 		System.out.println("post "+str);
	 		
	 	}

}
