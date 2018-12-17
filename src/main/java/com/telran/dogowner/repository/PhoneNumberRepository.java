package com.telran.dogowner.repository;

import com.telran.dogowner.entity.one_to_many.Employee;
import com.telran.dogowner.entity.one_to_many.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, Long> {

    List<PhoneNumber> findAllByEmployee(Employee employee);

    List<PhoneNumber> findAllByEmployee_Id(Long employeeId);
}
