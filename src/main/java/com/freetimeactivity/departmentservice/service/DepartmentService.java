package com.freetimeactivity.departmentservice.service;

import com.freetimeactivity.departmentservice.entity.Departmant;
import com.freetimeactivity.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Departmant saveDepartment(Departmant departmant) {
        log.info("Inside saveDepartment method of save departmentService");
        return departmentRepository.save(departmant);
    }

    public Departmant findByDepartmentId(Long departmentId) {
        log.info("Inside saveDepartment method of save departmentRepository");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
