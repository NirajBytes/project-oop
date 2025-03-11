package school_managment;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String courseId;
	private String courseName;
	private List<Student> students=new ArrayList<>();

	public Course(String courseId, String courseName) {
		 
		this.courseId = courseId;
		this.courseName = courseName;

	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void addStudent(Student student) {
		students.add(student);

	}

	public void removeStudent(Student student) {
		students.remove(student);

	}

	public void displayCourseInfo() {
		System.out.println("course ID: " + courseId);
		System.out.println("course Name: " + courseName);
		System.out.println("Enrolled students*****************************");
	
		int i=1;
		for (Student student : students) {
			System.out.print(i +":");
			System.out.println(student.getName());
			System.out.println(student.getCourse());
			i++;
		}

	}

}
