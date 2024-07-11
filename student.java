public class student extends person{
    private int studentID;
    private String course;
    public student(String name,int age,String address,int studentID,String course){
        super(name, age, address);
        this.studentID=studentID;
        this.course=course;

    }
    public int getstudentID(){
        return studentID;
    }
    public void setstudentID(){
        this.studentID=studentID;
    }
    public String getcourse(){
        return course;
    }
    public void setcouse(){
        this.course=course;
    }
@Override
public void displayinfo() {
    System.out.println("Student ID :"+studentID);//directly accessed in this class
    // System.out.println("Name :"+name);// we cannnot access name directly because it is private in base class 
    // here the concept of encapsulation used
    //access using getter and setter
    System.out.println("Name : "+getName());
    System.out.println("Age : "+getAge());
    System.out.println("Address : "+getAddress());
    System.out.println("Course : "+course);


}

    
}
