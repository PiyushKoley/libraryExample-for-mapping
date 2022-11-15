package com.example.spring.libraryManagementExample;

import com.example.spring.libraryManagementExample.Models.Card;
import com.example.spring.libraryManagementExample.Models.Student;
import com.example.spring.libraryManagementExample.Repository.CardRepository;
import com.example.spring.libraryManagementExample.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryManagementExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementExampleApplication.class, args);
	}

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	CardRepository cardRepository;

	@Override
	public void run(String... args) throws Exception {

		Student student = new Student("Piyush","India",29);

		Card card = new Card(10);

		student.setCard(card);

		int amount = student.getCard().getFine();

//		cardRepository.save(card);
		studentRepository.save(student);

	}
}
