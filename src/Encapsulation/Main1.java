package Encapsulation;
class  students{
    private int ID;
    private String name;
    private String gender;
    private String position;
    private float hours;
    private float wage;
    students(){

    }

    students(int ID, String name, String gender, String position, float hours , float wage){
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.position = position;
        this.hours = hours;
        this.wage = wage;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }
}

public class Main1 {
    public static void main(String[] args) {
        students students = new students();
        students.setName("Data");
        System.out.println( students.getName());

    }
}
