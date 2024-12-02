package view;

import java.util.List;

import model.Student;

public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo, List<String> subjects) {
        System.out.println("Student Details:");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
        System.out.println("Subjects: " + subjects);
    }

    public void printAllStudents(List<Student> students) {
        System.out.println("All Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
