package com.sahay.tutorial1.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sahay.tutorial1.entity.Student;
@Service
public class StudentService {
	public List<Student> findAll() {
		List<Student> students = List.of(new Student("Amit", "Kumar", LocalDate.now(), "sahay.mtech2013@gmail.com", 35),
				new Student("Sumit", "Kumar", LocalDate.now(), "mba.2012@gmail.com", 30),
				new Student("Sunny", "Leone", LocalDate.now(), "leone.sexy2013@gmail.com", 20));
		return students;
	}
}
