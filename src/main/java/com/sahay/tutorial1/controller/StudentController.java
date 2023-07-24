package com.sahay.tutorial1.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sahay.tutorial1.entity.Student;

@RestController
@RequestMapping("/api/students")
public class StudentController {

	@GetMapping 
	public ResponseEntity<List<Student>> findAllStudents(){
		List<Student> students = List.of(new Student("Amit", "Kumar", LocalDate.now(), "sahay.mtech2013@gmail.com", 35),
		new Student("Sumit", "Kumar", LocalDate.now(), "mba.2012@gmail.com", 30),
		new Student("Sunny", "Leone", LocalDate.now(), "leone.sexy2013@gmail.com", 20));
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
	}
}
