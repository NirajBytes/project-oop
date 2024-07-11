public abstract class person{
    private String name;
    private int age ;
    private String address;
    // this constructor is useful in  subclasses//this can be accesed by using super keyword without object //creation of this class although if we create the object of this class then error occurs bcaz of abstract class 
    public person(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;

    }
    //why setter are used even constructor is created ?
    //To : modify the initial value of instance variable 
    public String getName(){
        return name;
        
    }
    public void setName(){
        this.name=name;
    }
    public int getAge(){
        return age;
        
    }
    public void setAge(){
        this.age=age;
    }
    public String getAddress(){
        return address;
        
    }
    public void setAddress(){
        this.address=address;
    }
    public abstract void displayinfo();
}