public class Main {
    public static void main(String[] args) {
        System.out.println("******************SCHOOL MANAGMENT SYSTEM***************");
        school School=new school();
        student Student1=new student("Niraj", 22, "Ramnagar", 22005032, "CSE");
        student Student2=new student("Dhiraj", 23, "manishnagar", 19005024, "IT");
        teacher Teacher1=new teacher("sir1", 43, "amravati", 12, "DSA");
        teacher Teacher2=new teacher("sir2", 32, "Nagpur", 13, "DAA");
        course Course1=new course("C001", "Intro to programming");
        course Course2=new course("C002", "Calculus");
        School.addStudent(Student1);
        School.addStudent(Student2);

        School.addTeacher(Teacher1);
        School.addTeacher(Teacher2);

        Course1.addStudent(Student1);
        Course2.addStudent(Student2);

        School.addCourse(Course1);
        School.addCourse(Course2);

        School.displayAllStudents();
        School.displayAllteachers();
        School.displayAllCourses();
    }
}
