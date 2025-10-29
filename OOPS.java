public class OOPS{
    public static void main(String[] args) {
        Student ujjaval=new Student(15,"Ujjaval",88.5f);
        // System.out.println(ujjaval.rno);
        // System.out.println(ujjaval.name);
        // System.out.print(ujjaval.marks);
        Student random=new Student();
        System.out.print(random.name);
        // ujjaval.nameChange("Snooker lover");
        // ujjaval.greeting(); 


          
        
    }

}
class Student{
    int rno;
    String name;
    float marks=90.0f;
    void greeting(){
        System.out.print("My name is "+name);
    }
    void nameChange(String newname){
        this.name=newname;
    }
    Student(){
        this(13,"goyal",100.0f);
    }
    //we need to find a way to add the above properties object here
    Student(int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;

    }

}