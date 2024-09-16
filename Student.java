package Homework;

import java.util.Date;

class Student extends person implements IPerson {

    private float GPA;
    private String major;

    public Student() {
    }

    public Student(float GPA, String major, String ID, String fullname, Date Date0fbrith) {
        super(ID, fullname, Date0fbrith);
        this.GPA = GPA;
        this.major = major;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Full Name: " + fullname);
        System.out.println("Date of birth: " + Date0fbrith);
        System.out.println("GPA: " + GPA);
        System.out.println("Major: " + major);
    }

}
