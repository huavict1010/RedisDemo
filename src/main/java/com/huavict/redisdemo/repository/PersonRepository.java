package com.huavict.redisdemo.repository;

import com.huavict.redisdemo.bean.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, String> {
}