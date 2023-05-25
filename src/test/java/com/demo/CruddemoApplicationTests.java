package com.demo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entities.Student;
import com.demo.repository.StudentRepository;

@SpringBootTest
class CruddemoApplicationTests {
	@Autowired
	private StudentRepository studentRepository;
	@Test
	void saveoneStudent() {
	Student s = new Student();
	s.setName("yogesh");
	s.setCourse("development");
	s.setFee(1000);
	studentRepository.save(s);
	}
	@Test
	void deleteoneStudent() {
		studentRepository.deleteById(2L);
	}
	@Test
	void updateoneStudent() {
	Student s = new Student();
	s.setId(1);
	s.setName("harsh");
	s.setCourse("testing");
	s.setFee(1000);
	studentRepository.save(s);
	}
	@Test
	void findStudentById() {
		Optional<Student> findById = studentRepository.findById(1L);
		Student s = findById.get();
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getCourse());
		System.out.println(s.getFee());
	}
}

