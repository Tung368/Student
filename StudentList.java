package Homework;

import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> StudentList;
    public StudentList(){
        StudentList =new ArrayList<>();
    }
    public void addStudent(Student student){
        StudentList .add(student);
    }
    public void deleteStudentByID(String ID){
        StudentList .removeIf(student->student.getID().equals(ID));
    }
    public Student findStudentByID(String ID){
        for (Student student : StudentList){
            if (student.getID().equals(ID)){
                return student;
            }
        }
        return null;
    }
    public Student displayALLStudent(){
        for (Student student : StudentList){
            student.displayInfo();
            System.out.println("---");
        }
        return null;
    }
    public Student findTOPStudent(){
        if(StudentList.isEmpty())return null;
        Student topStudent=StudentList.get(0);
        for (Student Student : StudentList){
            if(Student.getGPA()>topStudent.getGPA()){
                topStudent=Student;
            }
        }
        return topStudent;
    }
}


