package com.web.SpringBootPracticeCrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.SpringBootPracticeCrud.model.Strundet;
import com.web.SpringBootPracticeCrud.repo.StudentRepo;
@Service
public class StudentService implements StudentInterface {
	@Autowired
	private StudentRepo repo;
	@Override
	public Strundet saveStudent(Strundet s) {
		Strundet s1=repo.save(s);
		return s1;
	}

	@Override
	public Strundet updateStudent(Strundet s, Integer sId) {
		Optional<Strundet> optional=repo.findById(sId);
		Strundet s1=optional.get();
		s1.setAddress(s.getAddress());
		s1.setsName(s.getsName());
		s1.setFee(s.getFee());
		Strundet st=repo.save(s1);
		return st;
	}

	@Override
	public Strundet getStudent(Integer sId) {
		Strundet st=repo.findById(sId).get();
		return st;
	}

	@Override
	public void deleteStudent(Integer sId) {
		repo.deleteById(sId);

	}

	@Override
	public List<Strundet> getAll() {
		List<Strundet> st=(List<Strundet>)repo.findAll();
		return st;
	}

}
