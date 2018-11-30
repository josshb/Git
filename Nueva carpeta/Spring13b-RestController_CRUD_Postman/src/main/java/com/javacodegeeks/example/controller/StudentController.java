package com.javacodegeeks.example.controller;

import java.net.URI;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.javacodegeeks.example.model.Student;
import com.javacodegeeks.example.repository.StudentRepository;

@RestController
@RequestMapping("/students")
public class StudentController {

	private final StudentRepository repository;

	@Autowired
	public StudentController(StudentRepository repository) {
		this.repository = repository;
	}
	
	@SuppressWarnings("serial")
	@ResponseStatus(HttpStatus.NOT_FOUND)
	class StudentNotFoundException extends RuntimeException {

		public StudentNotFoundException() {
			super("Student does not exist");
		}
	}
	
	//@GetMapping is a specialized RequestMapping. 
	//It specifies that HTTP GET requests to /students 
	//are mapped to the readStudents() method.
	@GetMapping
	Collection<Student> readStudents(){
		return this.repository.findAll();
	}
	
	
	/*
	 * this orElseThrow method at the end of the findById call and what does it do? 
	 * It is part of the java.util.Optional API. It returns the wrapped Student object
	 *  if present, otherwise it throws the exception provided by the exception supplier. 
	 *  However, we can substitute the supplier with a method reference to our custom 
	 *  exception class’ constructor. When this exception is thrown, a “404 Not Found” 
	 *  status code is returned, as described above.
     * https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html#orElseThrow-java.util.function.Supplier-.
	 */
	@GetMapping("/{id}")
	Student readStudent(@PathVariable Long id) {
		return this.repository.findById(id)
				.orElseThrow(StudentNotFoundException::new);
	}
	
	// @RequestBody Student student significa que un estudiante será el cuerpo de la respuesta
	@PostMapping
	ResponseEntity<?> addStudent(@RequestBody Student student){
		Student result = this.repository.save(student);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(result.getId())
				.toUri();
		
		/*
		 * Inside the method body, we build a java.net.URI object using ServletUriComponentsBuilder. 
		 * It builds the object by capturing the URI of the current request and appending the 
		 * placeholder /{id} to create a template. buildAndExpand(result.getId()) 
		 * inserts the id of the newly created student into the template. 
		 * The result is the URI of the new resource.
		 */

		return ResponseEntity.created(location).build();		
	}
	
	@PutMapping
	Student updateStudent(@RequestBody Student student) {
		return this.repository.update(student)
				.orElseThrow(StudentNotFoundException::new);
	}
	
	@DeleteMapping("/{id}")
	void deleteStudent(@PathVariable Long id) {
		this.repository.delete(id)
			.orElseThrow(StudentNotFoundException::new);
	}	
}
