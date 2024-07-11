public class teacher extends person{
    private int teacherID;
    private String subject;
    public teacher(String name,int age,String address,int teacherID,String subject){
        super(name, age, address);
        this.teacherID=teacherID;
        this.subject=subject;

    }
    public int getteacherID(){
        return teacherID;
    }
    public void setteacherID(){
        this.teacherID=teacherID;
    }
    public String getsubject(){
        return subject;
    }
    public void setsubject(){
        this.subject=subject;
    }
@Override
public void displayinfo() {
    System.out.println("Teacher ID :"+teacherID);//directly accessed in this class
    // System.out.println("Name :"+name);// we cannnot access name directly because it is private in base class 
    // here the concept of encapsulation used
    //access using getter and setter
    System.out.println("Name : "+getName());
    System.out.println("Age : "+getAge());
    System.out.println("Address : "+getAddress());
    System.out.println("Course : "+subject);


}

    
}
