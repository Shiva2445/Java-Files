package com.ibm.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;

@RestController
public class ContentController {
	// http://localhost:8084/text/Naveen
	@GetMapping(value = "/text{name}", produces = "text/plain")
	public String greetText(@PathVariable String name) {
		return "Welcome to Soring Boot, + name";
	}
	/*// http://localhost:8084/html?name=Naveen
	@GetMapping(value="/html", produces="text/html")
	public String greetHtml(@RequestParam String name) {
		return "<h1>Welcome to SB,"+name; 
	}*/
	// http://localhost:8084/text/xml
	@GetMapping(value="/xml", produces="text/xml")
	public String greetml(){
		return "<?xml version=\"1.0\"?><greeting>Welcome to SB</greeting>"; 
	}
	// http://localhost:8084/json
	@GetMapping(value="/json", produces="application/json")
	public String greetJson(){
		JSONPObject o=new JSONPObject("greeting","welcome to SB");
		return o.toString(); 
	}

}