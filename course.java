import java.util.ArrayList;
import java.util.List;

public class course {
    private String courseId;
    private String courseName;
    private List<student>students;
    public course(String courseId,String courseName){
        this.courseId=courseId;
        this.courseName=courseName;
        this.students=new ArrayList<>();
    }
        public String getCourseId(){
            return courseId;
    }
    public void setCourseId(String courseId){
        this.courseId=courseId;

    }
    public String getCourseName(){
        return courseName;
}
    public void setCourseName(String courseName){
        this.courseName=courseName;
    }
    
    public void addStudent(student Student){
        students.add(Student);

    }
    public void removeStudent(student Student){
        students.remove(Student);

    }
    public List<student> getStudents(){
        return students;
    }
    public void displayCourseInfo(){
        System.out.println("course ID: "+courseId);
        System.out.println("course Name: "+courseName);
        System.out.println("Enrolled students");
        for (student Student : students) {
            Student.displayinfo();
        }
    }

}

