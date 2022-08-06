package com.java.basics.classes.and.objects;

public class Student {

    //Fields
    public int studentId;
    public String studentName;

    Student() {
        System.out.println("This is default Constructor");
    }

    //Parameterized Constructor
    public Student(int id, String name) {
        studentId = id;
        studentName = name;
    }

    //Main method inside the class
    public static void main(String args[]) {

        //Creating an object
        Student student1 = new Student();

        System.out.println(student1.studentId);
        System.out.println(student1.studentName);
    }

    public void insertRecord(int id, String name) {
        studentId = id;
        studentName = name;
    }

    public void displayInformation() {
        System.out.println(studentId + " " + studentName);
    }
}
