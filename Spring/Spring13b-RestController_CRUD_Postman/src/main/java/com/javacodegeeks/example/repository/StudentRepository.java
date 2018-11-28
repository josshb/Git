package com.javacodegeeks.example.repository;

// METODOS
/**
 * findAll	Returns a Collection of all the students in the Map
 * findById	Searches the Map for a student with the specified ID. If found, the student is returned.
 * save	    Assigns the student an ID and saves the student in the Map.
 * update	Replaces the student in the Map if it exists.
 * delete	Deletes the student in the Map if it exists.
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.javacodegeeks.example.model.Student;

@Repository
public class StudentRepository {
	
	Map<Long, Student> students = new HashMap<>();
	
	/*
	 * Typically, the database will assign the unique id (or primary key) 
	 * when adding an entity. Since we are using an in-memory Map, 
	 * we must explicitly assign the student id in the repository class. 
	 * Allowing the client to assign the unique id is not RESTful.
	 */
	long currentId = 100;
	
	
	
	// Return all students
	public Collection<Student> findAll(){
		return students.values();
	}

	// Find the student with this id
	/*
	 * We are using java.util.Optional as a container for our Student object
	 *  as it will help us handle cases where Student is null. 
	 *  This is purely an implementation decision and has nothing to do 
	 *  with REST concepts or constraints.
	 */
	public Optional<Student> findById(Long id) {
		Student student = null;

		if (students.containsKey(id)) student = students.get(id);
		return Optional.ofNullable(student);
	}
		
	// Save a new student	
	public Student save(Student student) {
		student.setId(++currentId);
		students.put(student.getId(), student);
		return student;
	}
	
	// Update the student with this id
	public Optional<Student> update(Student student) {
		Student currentStudent = students.get(student.getId());

		if (currentStudent != null) {
			students.put(student.getId(), student);
			currentStudent = students.get(student.getId());
		}
		return Optional.ofNullable(currentStudent);
	}
	
	// Delete student with this id
	public Optional<Student> delete(Long id) {
		Student currentStudent = students.get(id);

		if (currentStudent != null) {
			students.remove(id);
		}
		return Optional.ofNullable(currentStudent);
	}
}
