package lk.ac.vau.Controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import lk.ac.vau.Model.Lecturer;
import lk.ac.vau.Repo.LecturerRepo;

public class LecturerController {
	private LecturerRepo lect =new LecturerRepo();
	
	
	@GetMapping
	public Collection<Lecturer> getAll(){
		return lect.getAll();
		
	}
		
	@GetMapping("/{id}")	
	public Lecturer get(@PathVariable("id") Long id) {
		return lect.get(id);
		
	}
		
	@PostMapping	
	public void add(@RequestBody Lecturer student) {
		lect.add(student);
		
	}
		
	@DeleteMapping("/{id}")	
	public void delete(@PathVariable("id") Long id) {
		lect.delete(id);
		
	}
		
	@PutMapping("/{id}")	
	public void update(@PathVariable("id") Long id,@RequestBody Lecturer lecturer) {
		lect.update(id,lecturer);
		
	}
}
