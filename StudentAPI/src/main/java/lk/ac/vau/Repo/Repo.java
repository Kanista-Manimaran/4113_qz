package lk.ac.vau.Repo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import lk.ac.vau.Model.Course;
import lk.ac.vau.Model.PrimaryId;
import lk.ac.vau.Model.Student;


public class Repo<k,v extends PrimaryId<k>> {
	
	Map<k,v > map=new HashMap<k, v>();
	
	public Collection<v> getAll(){
		return map.values();
		
	}
	
	public v get( k id) {
		return map.get(id);
		
	}
	
	public void add( v ele) {
		map.put(ele.getId(),ele);
		
	}
		
	public void delete(k id) {
		map.remove(id);
		
	}
		
		
	public void update( k id,v ele) {
		map.put(id,ele);
		
	}
	
	
}
