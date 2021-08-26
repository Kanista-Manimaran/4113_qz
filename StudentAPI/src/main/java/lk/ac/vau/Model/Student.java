package lk.ac.vau.Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Student extends PrimaryId<String>{
	
	private String name;
	private int age;
	private String degree;
	private double gPA;
	
	public Student( String id,String name, int age, String degree, double gPA) {
		super(id);
		
		this.name = name;
		this.age = age;
		this.degree = degree;
		this.gPA = gPA;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public double getgPA() {
		return gPA;
	}
	public void setgPA(double gPA) {
		this.gPA = gPA;
	}
	
	
	

}
