package school_managment;

import java.util.Scanner;

public class Main {
	static final String P_Name = "******************SCHOOL MANAGEMENT SYSTEM***************";

	public static void main(String[] args) {
		System.out.println(P_Name);

		Scanner scanner = new Scanner(System.in);
		School school = new School();
//		System.out.println("Enter number of students: ");
//		int numStudents = scanner.nextInt();
//		scanner.nextLine(); // Consume newline
//Hi for check
//		for (int i = 0; i < numStudents; i++) {
//			System.out.println("Enter student name: ");
//			String name = scanner.nextLine();
//			System.out.println("Enter student age: ");
//			int age = scanner.nextInt();
//			scanner.nextLine(); // Consume newline
//			System.out.println("Enter student address: ");
//			String address = scanner.nextLine();
//			System.out.println("Enter student ID: ");
//			int studentId = scanner.nextInt();
//			scanner.nextLine(); // Consume newline
//			System.out.println("Enter student course: ");
//			String course = scanner.nextLine();
//
//			Student student = new Student(name, address, age, studentId, course);
//			school.addStudent(student);
//		}
		Course course = new Course("345", "cse");
		school.addCourse(course);

		Student student = new Student("niraj", "lohari sawanga", 23, 22005032, "cse");
		if(course.getCourseName().equalsIgnoreCase(student.getCourse())) {
			course.addStudent(student);
		}
		school.addStudent(student);

//		System.out.println("Enter number of teachers: ");
//		int numTeachers = scanner.nextInt();
//		scanner.nextLine(); // Consume newline
//
//		for (int i = 0; i < numTeachers; i++) {
//			System.out.println("Enter teacher name: ");
//			String name = scanner.nextLine();
//			System.out.println("Enter teacher age: ");
//			int age = scanner.nextInt();
//			scanner.nextLine(); // Consume newline
//			System.out.println("Enter teacher address: ");
//			String address = scanner.nextLine();
//			System.out.println("Enter teacher ID: ");
//			int teacherId = scanner.nextInt();
//			scanner.nextLine(); // Consume newline
//			System.out.println("Enter teacher subject: ");
//			String subject = scanner.nextLine();
//			Teacher teacher = new Teacher(name, address, age, subject, teacherId);
//			school.addTeacher(teacher);
//		}
		Teacher teacher = new Teacher("Gagan", "Katol", 45, "Chem", 345);
		school.addTeacher(teacher);

//		System.out.println("Enter number of courses: ");
//		int numCourses = scanner.nextInt();
//		scanner.nextLine(); // Consume newline
//
//		for (int i = 0; i < numCourses; i++) {
//			System.out.println("Enter course ID: ");
//			String courseId = scanner.nextLine();
//			System.out.println("Enter course name: ");
//			String courseName = scanner.nextLine();
//
//			Course course = new Course(courseId, courseName, null);
//
//			school.addCourse(course);
//		}
		
		school.displayAllStudents();
		System.out.println("------------------------------------------------------------------------------------");
		school.displayAllteachers();
		System.out.println("------------------------------------------------------------------------------------");
		school.displayAllCourses();
		System.out.println("------------------------------------------------------------------------------------");
		scanner.close();
	}

}
