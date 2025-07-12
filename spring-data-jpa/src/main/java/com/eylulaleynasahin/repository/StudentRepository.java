package com.eylulaleynasahin.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.eylulaleynasahin.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	//SQL example
	//@Query(value = "select * from student.student", nativeQuery = true)
	//List<Student> findAllStudents();
	
	//HQL example
	@Query(value = "from Student", nativeQuery = false)
	List<Student> findAllStudents();
	
	@Query(value = "from Student s where s.id= :studentId")
	Optional<Student> findStudentById(Integer studentId);
}

