package lk.ac.vau.Controller;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import lk.ac.vau.Model.Student;
import lk.ac.vau.Repo.Repo;
import lk.ac.vau.Repo.StudentRepo;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("student")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)

public class StudnetController {
	private StudentRepo students =new StudentRepo();
	
	
	@GetMapping
	public Collection<Student> getAll(){
		return students.getAll();
		
	}
		
	@GetMapping("/{id}")	
	public Student get(@PathVariable("id") String id) {
		return students.get(id);
		
	}
		
	@PostMapping	
	public void add(@RequestBody Student student) {
		students.add(student);
		
	}
		
	@DeleteMapping("/{id}")	
	public void delete(@PathVariable("id") String id) {
		students.delete(id);
		
	}
		
	@PutMapping("/{id}")	
	public void update(@PathVariable("id") String id,@RequestBody Student student) {
		students.update(id,student);
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
