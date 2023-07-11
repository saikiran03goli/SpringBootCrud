package com.web.SpringBootPracticeCrud.service;

import java.util.List;

import com.web.SpringBootPracticeCrud.model.Strundet;

public interface StudentInterface {

	public Strundet saveStudent(Strundet s);
	public Strundet updateStudent(Strundet s ,Integer sId);
	public Strundet getStudent(Integer sId);
	public void deleteStudent(Integer sId);
	public List<Strundet> getAll();
	
}
