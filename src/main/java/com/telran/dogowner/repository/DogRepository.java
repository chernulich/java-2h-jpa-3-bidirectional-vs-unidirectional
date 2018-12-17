package com.telran.dogowner.repository;

import com.telran.dogowner.entity.one_to_one.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {

//    Dog findByOwner(Owner owner);
}
