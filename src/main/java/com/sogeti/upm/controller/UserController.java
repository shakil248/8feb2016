package com.sogeti.upm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import com.sogeti.upm.dto.UserDetailDto;
import com.sogeti.upm.model.User;
import com.sogeti.upm.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	   public ModelAndView  printHello() {
	     
User user = userService.getUser("1");
//model.addAttribute("user", user);
//	      return "hello";
System.out.println(user.getEmailId());
return new ModelAndView("hello", "user", user);
	   }
	
	 @RequestMapping(value = "/user/", method = RequestMethod.GET)
	    public ResponseEntity<List<User>> listAllUsers() {
	        List<User> users = null;
//	        if(users.isEmpty()){
//	            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
//	        }
	        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	    }
	 
	 @RequestMapping(value = "/user", method = RequestMethod.POST)
	    public @ResponseBody ResponseEntity<Void> createUser(@RequestBody UserDetailDto userDetailDto) {
	        System.out.println("Creating User " +userDetailDto.getEmailId());
	  
//	        if (userService.isUserExist(user)) {
//	            System.out.println("A User with name " + user.getUsername() + " already exist");
//	            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
//	        }
	        userService.createUser(userDetailDto);
	  
	        HttpHeaders headers = new HttpHeaders();
//	        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getEmailId()).toUri());
	        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	    }
	  
	 	@RequestMapping(value = "/poster", method = RequestMethod.POST)
	 	public void poster(@RequestBody String str){
	 		System.out.println("post "+str);
	 		
	 	}

}
