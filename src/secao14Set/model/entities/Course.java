package secao14Set.model.entities;

import java.util.Set;

public class Course {
	private char idCourse;
	private Set<Student> students;
	
	public Course(char idCourse, Set<Student> students) {
		this.idCourse = idCourse;
		this.students = students;
	}

	public char getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(char idCourse) {
		this.idCourse = idCourse;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}		
	
}
