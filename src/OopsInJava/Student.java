package OopsInJava;
//creating a new data type
public class Student{
    String name;
    int rno;
    double percent;
    final String schoolname = "MSMPS";
    static int numberofStudent;

    public Student(String name , int rno , double percent){
     this.name = name;
     this.rno = rno;
     this.percent = percent;
     numberofStudent++;
    }
    public int getRno(){ // getter
        return rno;
    }
    public void setRno(int roll){
        this.rno = rno;
    }
}
