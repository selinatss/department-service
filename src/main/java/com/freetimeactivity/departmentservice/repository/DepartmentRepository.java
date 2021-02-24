package com.freetimeactivity.departmentservice.repository;

import com.freetimeactivity.departmentservice.entity.Departmant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Departmant, Long> {

    Departmant findByDepartmentId(Long departmentId);
}
