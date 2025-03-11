package school_managment;

import java.util.ArrayList;
import java.util.List;

public class School {
	private List<Student> students=new ArrayList<>();
	private List<Teacher> teachers=new ArrayList<>();
	private List<Course> courses=new ArrayList<>();
	public void addStudent(Student student) {
		students.add(student);
	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public void addCourse(Course course) {
		courses.add(course);
	}

	public void displayAllStudents() {
		System.out.println("All Students: ");
		for (Student student : students) {
			student.displayinfo();
		}
	}

	public void displayAllteachers() {
		System.out.println("All Teachers: ");
		for (Teacher teacher : teachers) {
			teacher.displayinfo();
		}
	}

	public void displayAllCourses() {
		System.out.println("All Courses: ");
		for (Course course : courses) {
			course.displayCourseInfo();
		}

	}
}
