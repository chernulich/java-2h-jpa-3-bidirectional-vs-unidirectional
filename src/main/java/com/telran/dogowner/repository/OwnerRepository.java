package com.telran.dogowner.repository;

import com.telran.dogowner.entity.one_to_one.Owner;
import org.springframework.data.jpa.repository.JpaRepository;



public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
