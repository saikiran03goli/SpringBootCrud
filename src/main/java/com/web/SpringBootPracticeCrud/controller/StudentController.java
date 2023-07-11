package com.web.SpringBootPracticeCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.SpringBootPracticeCrud.model.Strundet;
import com.web.SpringBootPracticeCrud.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/save")
	public Strundet save(@RequestBody Strundet s ,Model m) {
		Strundet st=service.saveStudent(s);
		return st;
	}
	@PutMapping("/update/{sId}")
	public Strundet updateStudent(@PathVariable Integer sId,@RequestBody Strundet s) {
		Strundet st=service.updateStudent(s, sId);
		return st;
	}
	@GetMapping("/get/{sId}")
	public Strundet get(@PathVariable Integer sId) {
		Strundet st=service.getStudent(sId);
		return st;
	}
	@GetMapping("/get")
	public List<Strundet> get(){
		List<Strundet> st=service.getAll();
		return st;
	}
	@DeleteMapping("/delete/{sId}")
	public void delete(@PathVariable Integer sId) {
		service.deleteStudent(sId);
	}

}
