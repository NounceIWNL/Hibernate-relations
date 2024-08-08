package org.itstep;

import org.itstep.one_to_many_uni.Subscriber;
import org.itstep.one_to_many_uni.SubscriberRepository;
import org.itstep.one_to_one_bl.PassportRepository;
import org.itstep.one_to_one_bl.PersonRepository;
import org.itstep.one_to_one_uni.AddressRepository;
import org.itstep.one_to_one_uni.EmployeeRepository;
import org.itstep.one_to_one_uni.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    PassportRepository passportRepository;
    @Autowired
    PersonRepository personRepository;
    @Autowired
    SubscriberRepository subscriberRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //one-to-one unidirectional

/*
        employeeService.deleteEmployeeById(1L);

        employeeService.getAddresses().forEach(System.out::println);
        employeeService.getEmployees().forEach(System.out::println);

        addressRepository.findByCityAndStreet("Minsk", "Pobediteley st.").forEach(System.out::println);

        employeeRepository.findByCity("Vitebsk").forEach(System.out::println);
        employeeRepository.findByCity2("Vitebsk").forEach(System.out::println);
        employeeRepository.findByCity3("Vitebsk").forEach(System.out::println);
        employeeRepository.findByCity4("Vitebsk").forEach(System.out::println);
  */


//        personRepository.deleteById(1L);
//        personRepository.findAll().forEach(System.out::println);
//        passportRepository.findAll().forEach(System.out::println);
//        System.out.println();
//
//        passportRepository.deleteById(2L);
//        personRepository.findAll().forEach(System.out::println);
//        passportRepository.findAll().forEach(System.out::println);
//        System.out.println();

        //subscriberRepository.findAll().forEach(System.out::println);

    }
}
