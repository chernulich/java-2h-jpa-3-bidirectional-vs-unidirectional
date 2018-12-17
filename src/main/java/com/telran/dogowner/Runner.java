package com.telran.dogowner;

import com.telran.dogowner.entity.one_to_many.Employee;
import com.telran.dogowner.entity.one_to_many.PhoneNumber;
import com.telran.dogowner.entity.one_to_one.Dog;
import com.telran.dogowner.entity.one_to_one.Owner;
import com.telran.dogowner.repository.DogRepository;
import com.telran.dogowner.repository.EmployeeRepository;
import com.telran.dogowner.repository.OwnerRepository;
import com.telran.dogowner.repository.PhoneNumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private DogRepository dogRepository;

    @Autowired
    private OwnerRepository ownerRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private PhoneNumberRepository phoneNumberRepository;

    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee();
        employee.setName("Michael");

        employeeRepository.save(employee);

        PhoneNumber phoneNumber1 = new PhoneNumber();
        phoneNumber1.setEmployee(employee);
        phoneNumber1.setPhoneNumber("+972501234567");

        PhoneNumber phoneNumber2 = new PhoneNumber();
        phoneNumber2.setEmployee(employee);
        phoneNumber2.setPhoneNumber("+972529876543");

        List<PhoneNumber> phoneNumbers = phoneNumberRepository.saveAll(
                Arrays.asList(phoneNumber1, phoneNumber2)
        );

        employee.setPhoneNumbers(phoneNumbers);

        employeeRepository.save(employee);


    }

    private void dogOwner() {
        Owner owner = new Owner();
        owner.setOwnerName("Peter");

        ownerRepository.save(owner); //owner = owner row in MySQL
        //owner now has owner_id


        Dog dog = new Dog();
        dog.setNickname("Charly");


        dog.setOwner(owner /**/); //owner_id

        dogRepository.save(dog); //dog_id

//        owner.setDog(dog);
//        ownerRepository.save(owner);
    }
}
