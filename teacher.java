package school_managment;

public class Teacher extends Person {
	private int teacherId;
	private String subject;

	public Teacher(String name, String address, int age, String subject, int teacherId) {
		super(name, address, age);
		this.subject = subject;
		this.teacherId = teacherId;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void displayinfo() {
		  System.out.println("Teacher ID :"+getTeacherId());//directly accessed in this class
		    // System.out.println("Name :"+name);// we cannnot access name directly because it is private in base class 
		    // here the concept of encapsulation used
		    //access using getter and setter
		    System.out.println("Name : "+getName());
		    System.out.println("Age : "+getAge());
		    System.out.println("Address : "+getAddress());
		    System.out.println("Course : "+getSubject());	
	}

}
