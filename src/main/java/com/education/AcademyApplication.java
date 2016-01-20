package com.education;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.education.domain.Student;
import com.education.domain.StudentRepository;


@SpringBootApplication
public class AcademyApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcademyApplication.class, args);
	}
}

@Component
class AcademyCommandLineRunner implements CommandLineRunner
	{
    @Autowired 
    StudentRepository repository;
	@Override
	 public void run(String... args) throws Exception{
	    
	// save a couple of customers
                      
                        // fetch all customers
	    System.out.println("Students found with findAll():");
	    System.out.println("-------------------------------");
                        int k=0;
                        for (Student student : repository.findAll()) {
                            System.out.println(student.toString()+" count "+k);
                                k++;
                        }
}
	
	}
	
