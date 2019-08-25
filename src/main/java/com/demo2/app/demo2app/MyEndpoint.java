package com.demo2.app.demo2app;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest-api/")
public class MyEndpoint {
	
	@Autowired
	StudentRepo studentRepo;
	
	@GetMapping("ping")
	public String pingServer() {
		return "Server time :"+new Date();
	}
	
	@GetMapping("student")
	public Iterable<StudentEntity> getStudent() {
		return studentRepo.findAll();
	}

}
