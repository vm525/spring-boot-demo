package com.nvm.springbootdemo.controller;

import com.nvm.springbootdemo.entity.Department;
import com.nvm.springbootdemo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Department saveDepartment(@RequestBody Department department) {
        // beauty of @RequestBody => automatically unmarshall and decodes JSON from client to Department java object
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments/get")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/department/get/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId) {
        return departmentService.getDepartmentById(departmentId).orElse(
                new Department(-1L, null, null, null)
        );
    }
}
