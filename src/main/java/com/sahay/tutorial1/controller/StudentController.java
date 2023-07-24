package com.sahay.tutorial1.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

	@GetMapping 
	public ResponseEntity<List<String>> findAllStudents(){
		List<String> students = List.of("Amit","Sumit","Leah","Sunny");
		return new ResponseEntity<List<String>>(students,HttpStatus.OK);
	}
}
