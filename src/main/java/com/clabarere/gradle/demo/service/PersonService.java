package com.clabarere.gradle.demo.service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import com.clabarere.gradle.demo.model.Person;

@Service
public class PersonService {
	Hashtable<String, Person> persons = new Hashtable<String, Person>();
	
	public PersonService(){
		Person p = new Person();
		p.setId("1");
		p.setAge(21);
		p.setFirstName("User1");
		p.setLastName("********");
		
		persons.put("1", p);
		
		p = new Person();
		p.setId("2");
		p.setAge(21);
		p.setFirstName("User2");
		p.setLastName("********");

		persons.put("2", p);

		p = new Person();
		p.setId("3");
		p.setAge(21);
		p.setFirstName("User3");
		p.setLastName("********");

		persons.put("3", p);

	}
	
	public Person getPerson(String id){
		if(persons.containsKey(id)){
			return persons.get(id);
		}else{
			return null;
		}
	}
	
	public Hashtable<String, Person> getAll(){
		return persons;
	}

}
