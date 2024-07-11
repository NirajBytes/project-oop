import java.util.ArrayList;
import java.util.List;

public class school {
    private List<student> students;
    private List<teacher> teachers;
    private List<course> courses;
    public school(){
        students=new ArrayList<>();
        teachers=new ArrayList<>();
        courses=new ArrayList<>();
    }
    public void addStudent(student Student){
        students.add(Student);
    }
    public void addTeacher(teacher Teacher){
        teachers.add(Teacher);
    }
    public void addCourse(course Course){
        courses.add(Course);
    }
    public void displayAllStudents(){
        System.out.println("All Students: ");
        for (student Student : students) {
            Student.displayinfo();
        }
    }
    public void displayAllteachers(){
        System.out.println("All Teachers: ");
        for (teacher Teacher : teachers) {
            Teacher.displayinfo();
        }
    }
    public void displayAllCourses(){
        System.out.println("All Courses: ");
        for (course Course : courses) {
            Course.displayCourseInfo();
        }
    }


    
}