package com.telran.dogowner.repository;

import com.telran.dogowner.entity.one_to_many.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
