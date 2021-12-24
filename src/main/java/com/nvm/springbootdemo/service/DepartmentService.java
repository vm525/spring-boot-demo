package com.nvm.springbootdemo.service;

import com.nvm.springbootdemo.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> getAllDepartments();

    Optional<Department> getDepartmentById(Long departmentId);
}
