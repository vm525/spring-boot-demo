package com.nvm.springbootdemo.repository;

import com.nvm.springbootdemo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    //JpaRepository expects <Entity, Type of @Id/Primary Key>

}
