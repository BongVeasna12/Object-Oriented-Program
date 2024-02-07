package Encapsulation;

class  teacher{
   private int teacherID;
   private String teacherName;
   private  String teacherGender;
   private int age;
    public teacher(){

    }
    public teacher(int teacherID, String teacherName, String teacherGender, int age) {
        this.teacherID = teacherID;
        this.teacherName = teacherName;
        this.teacherGender = teacherGender;
        this.age = age;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherGender() {
        return teacherGender;
    }

    public void setTeacherGender(String teacherGender) {
        this.teacherGender = teacherGender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {

        teacher teacher = new teacher();
        teacher.setTeacherID(007);
        System.out.println("Teacher ID is: "+teacher.getTeacherID());
    }
}
