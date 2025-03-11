package school_managment;

public class Student extends Person {
	private int studentId;
	private String course;

	public Student(String name, String address, int age, int studentId, String course) {
		super(name, address, age);
		this.studentId = studentId;
		this.course = course;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void displayinfo() {
		System.out.println("Student ID :" + getStudentId());// directly accessed in this class
		// System.out.println("Name :"+name);// we cannnot access name directly because
		// it is private in base class
		// here the concept of encapsulation used
		// access using getter and setter
		System.out.println("Name : " + getName());
		System.out.println("Age : " + getAge());
		System.out.println("Address : " + getAddress());
		System.out.println("Course : " + course);

	}

}
