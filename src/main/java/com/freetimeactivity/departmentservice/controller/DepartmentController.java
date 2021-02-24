package com.freetimeactivity.departmentservice.controller;

import com.freetimeactivity.departmentservice.entity.Departmant;
import com.freetimeactivity.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Departmant saveDepartment(@RequestBody Departmant departmant){
        log.info("Inside saveDepartment method of save departmentController");
        return departmentService.saveDepartment(departmant);
    }

    @GetMapping("/{id}")
    public Departmant findByDepartmentId(@PathVariable("id")Long departmentId){
        log.info("Inside findByDepartmentId method of save departmentController");
        return departmentService.findByDepartmentId(departmentId);
    }
}
