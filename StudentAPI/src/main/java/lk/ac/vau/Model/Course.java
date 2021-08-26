package lk.ac.vau.Model;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Course extends PrimaryId<String>{
	
	
	private String coursename;
	private int credit;
	
	public Course(String id, String coursename, int credit) {
		super(id);
		this.coursename = coursename;
		this.credit = credit;
	}

	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	
	
	
	
	
}
