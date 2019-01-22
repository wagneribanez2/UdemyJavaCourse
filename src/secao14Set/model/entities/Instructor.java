package secao14Set.model.entities;

import java.util.HashSet;
import java.util.Set;

public class Instructor {

	private Set<Course> courses;

	public Instructor(Set<Course> courses) {
		this.courses = courses;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
	
	public int totalOfStudents() {
		Set<Student> students = new HashSet<>();
		
		for(Course c : getCourses()) {
			for(Student st: c.getStudents()) {
				if(!students.contains(st)) {
					students.add(st);
				}
			}
		}
		
		return students.size();
		
	}

}
