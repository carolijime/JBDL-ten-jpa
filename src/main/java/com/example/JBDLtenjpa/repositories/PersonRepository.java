package com.example.JBDLtenjpa.repositories;

import com.example.JBDLtenjpa.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
