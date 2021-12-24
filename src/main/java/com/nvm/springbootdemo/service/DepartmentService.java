package com.nvm.springbootdemo.service;

import com.nvm.springbootdemo.entity.Department;

import java.util.List;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> getAllDepartments();
}
