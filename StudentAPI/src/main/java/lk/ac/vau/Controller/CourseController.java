package lk.ac.vau.Controller;

import lk.ac.vau.Controller.StudnetController;

import java.util.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import lk.ac.vau.Model.Course;
import lk.ac.vau.Repo.CourseRepo;
import lk.ac.vau.Repo.Repo;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("course")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)




public class CourseController {
	
	private CourseRepo courses =new CourseRepo();
	
	
	@GetMapping
	public Collection<Course> getAll(){
		return courses.getAll();
		
	}
		
	@GetMapping("/{id}")	
	public Course get(@PathVariable("id") String id) {
		return courses.get(id);
		
	}
		
	@PostMapping	
	public void add(@RequestBody Course course) {
		courses.add(course);
		
	}
		
	@DeleteMapping("/{id}")	
	public void delete(@PathVariable("id") String id) {
		courses.delete(id);
		
	}
		
	@PutMapping("/{id}")	
	public void update(@PathVariable("id") String id,@RequestBody Course course) {
		courses.update(id,course);
		
	}
		
	
	
	
	
	
	
	
	
}
