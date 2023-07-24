package com.sahay.tutorial1.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sahay.tutorial1.entity.Student;
import com.sahay.tutorial1.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	@GetMapping 
	public ResponseEntity<List<Student>> findAllStudents(){
		List<Student> students=studentService.findAll();
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
	}
}
