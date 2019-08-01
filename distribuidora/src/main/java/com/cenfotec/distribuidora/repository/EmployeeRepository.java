package com.cenfotec.distribuidora.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cenfotec.distribuidora.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
   @Query(value= "SELECT * FROM temployee where id_delear = :id", nativeQuery = true) 
    Collection<Employee> findByIdDelear(@Param("id")int id);

}
