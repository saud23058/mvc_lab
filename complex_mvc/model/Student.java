package model;


import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String rollNo;
    private List<String> subjects;

    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.subjects = new ArrayList<>();
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void addSubject(String subject) {
        subjects.add(subject);
    }

    public void updateSubject(int index, String newSubject) {
        if (index >= 0 && index < subjects.size()) {
            subjects.set(index, newSubject);
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Subjects: " + subjects;
    }
}
