package lk.ac.vau.Model;

public class Lecturer extends PrimaryId<Long>{
	
	private String Name;
	private String Department;
	public Lecturer( Long id,String name, String department) {
		super(id);
		
		Name = name;
		Department = department;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
