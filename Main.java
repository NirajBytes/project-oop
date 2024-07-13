import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("******************SCHOOL MANAGMENT SYSTEM***************");
        Scanner scanner = new Scanner(System.in);
        school School = new school();
        System.out.println("Enter number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter student name: ");
            String name = scanner.nextLine();
            System.out.println("Enter student age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("Enter student address: ");
            String address = scanner.nextLine();
            System.out.println("Enter student ID: ");
            int studentID = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("Enter student course: ");
            String course = scanner.nextLine();

            student Student = new student(name, age, address, studentID, course);
            School.addStudent(Student);
        }

        System.out.println("Enter number of teachers: ");
        int numTeachers = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numTeachers; i++) {
            System.out.println("Enter teacher name: ");
            String name = scanner.nextLine();
            System.out.println("Enter teacher age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("Enter teacher address: ");
            String address = scanner.nextLine();
            System.out.println("Enter teacher ID: ");
            int teacherID = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("Enter teacher subject: ");
            String subject = scanner.nextLine();

            teacher Teacher = new teacher(name, age, address, teacherID, subject);
            School.addTeacher(Teacher);
        }

        System.out.println("Enter number of courses: ");
        int numCourses = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numCourses; i++) {
            System.out.println("Enter course ID: ");
            String courseId = scanner.nextLine();
            System.out.println("Enter course name: ");
            String courseName = scanner.nextLine();

            course Course = new course(courseId, courseName);
            School.addCourse(Course);
        }

        School.displayAllStudents();
        School.displayAllteachers();
        School.displayAllCourses();
        scanner.close();
    }
}
