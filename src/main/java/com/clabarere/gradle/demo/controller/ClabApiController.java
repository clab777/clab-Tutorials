package com.clabarere.gradle.demo.controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clabarere.gradle.demo.model.ApiResponse;
import com.clabarere.gradle.demo.model.Person;
import com.clabarere.gradle.demo.service.PersonService;

@RestController
@RequestMapping("/clab-api")
public class ClabApiController {
	
	@Autowired
	PersonService service;

    @RequestMapping("/hello/{name}")
    public ApiResponse home(@PathVariable("name") String name) {
        return new ApiResponse("SUCCESS", "hello: " +name);
    }
    
	@RequestMapping(value="/contacts/all",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Hashtable<String, Person> getAll(){
		return service.getAll();
	}
	
	@RequestMapping(value="/contacts/{id}",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Person getPerson(@PathVariable("id") String id){
		return service.getPerson(id);
	}
}
