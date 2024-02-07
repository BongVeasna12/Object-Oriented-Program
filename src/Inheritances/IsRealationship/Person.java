package Inheritances.IsRealationship;

import java.util.Scanner;
 public class Person {
    String name;
    int age;
    String position;
    //    public Main(){}
    public Person(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public Person() {

    }

    Person addRecord(Scanner input) {
        System.out.println("Enter name: " + name);
        name = input.nextLine();
        System.out.println("Enter age: " + age);
        age = input.nextInt();
        System.out.println("Enter position: " + position);
        position = input.nextLine();
        return this;
    }

    void showRecord() {
        System.out.println("Enter name: " + name);
        System.out.println("Enter age: " + age);
        System.out.println("Enter position: " + position);
    }


    class  Student extends Person {

        int StudentID;
        float score;
        String calssName;
        Student(int studentID,String name, int age , String possition, float score, String calssName){
            super(name, age, possition);
            this.StudentID = studentID;
            this.score = score;
            this.calssName = calssName;
        }

        Student addRecord(Scanner input) {
            System.out.println("Enter Student ID: ");
            StudentID = input.nextInt();
            super.addRecord(input);
            input.nextLine();
            System.out.println("Enter Student Classname : ");
            calssName = input.nextLine();
            System.out.println("Enter Student Score :");
             score = input.nextFloat();

            return this;
        }

        //print add record

        void showRecord() {
            System.out.println("Student ID is : " + StudentID);
            super.showRecord();
            System.out.println("Student ClassName : " + calssName);
            System.out.println("Student Score :" + score);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person person= new Person();



    }


}

class Worker extends Person {

    public Worker(String name, int age, String position, int workerID, float hour, float wage) {
        super(name, age, position);
        this.workerID = workerID;
        this.hour = hour;
        this.wage = wage;
    }

    int workerID;
    float hour;
    float wage;

    Worker addRecord(Scanner input) {
        System.out.println("Enter worker ID: " + workerID);
        workerID = input.nextInt();
        addRecord(input);
        System.out.println("Enter worker : " + hour);
        hour = input.nextFloat();
        System.out.println("Enter wage: " + wage);
        return this;
    }

    void showRecord() {
        System.out.println("Enter worker ID: " + workerID);
        System.out.println("Enter worker hours: "+ hour);
        System.out.println("Enter worker wage : "+ wage);
    }
}
