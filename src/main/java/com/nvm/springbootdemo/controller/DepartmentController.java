package com.nvm.springbootdemo.controller;

import com.nvm.springbootdemo.entity.Department;
import com.nvm.springbootdemo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DeadlockLoserDataAccessException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department/save")
    public Department saveDepartment(@RequestBody Department department) {
        // beauty of @RequestBody => automatically unmarshall and decodes JSON from client to Department java object
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments/get")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }
}
