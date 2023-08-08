package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.Entity.Student5;
import com.main.Service.HomeService;

@RestController
@RequestMapping("/demoStudent")
public class Homecontroller {
	
	@Autowired
	HomeService hs;
	
	@PostMapping("/saveStudent")
	public String savedata(@RequestBody Student5 s) {
		hs.saveData(s);
		return "DATA ADD SUCCESSFULLY";
		
	}
	@GetMapping("/alldata")
	public Iterable<Student5> getdata(){
		Iterable<Student5> itr=hs.getalldata();
		return itr;
		
	}

}
