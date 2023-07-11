package com.web.SpringBootPracticeCrud.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.SpringBootPracticeCrud.model.Strundet;
@Repository
public interface StudentRepo extends CrudRepository<Strundet, Integer> {

}
