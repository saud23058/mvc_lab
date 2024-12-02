package controllor;


import java.util.ArrayList;
import java.util.List;

import model.Student;
import view.StudentView;

public class StudentController {
    private List<Student> students;
    private StudentView view;

    public StudentController(StudentView view) {
        this.students = new ArrayList<>();
        this.view = view;
    }

    // Add a new student
    public void addStudent(String name, String rollNo) {
        Student student = new Student(name, rollNo);
        students.add(student);
        view.displayMessage("Student added successfully: " + student);
    }

    // Update an existing student's name
    public void updateStudentName(String rollNo, String newName) {
        for (Student student : students) {
            if (student.getRollNo().equals(rollNo)) {
                student.setName(newName);
                view.displayMessage("Student updated successfully: " + student);
                return;
            }
        }
        view.displayMessage("Student with Roll No: " + rollNo + " not found.");
    }

    // Add a subject to a student
    public void addSubjectToStudent(String rollNo, String subject) {
        for (Student student : students) {
            if (student.getRollNo().equals(rollNo)) {
                student.addSubject(subject);
                view.displayMessage("Subject added successfully to " + student.getName());
                return;
            }
        }
        view.displayMessage("Student with Roll No: " + rollNo + " not found.");
    }

    // Update a subject for a student
    public void updateSubject(String rollNo, int subjectIndex, String newSubject) {
        for (Student student : students) {
            if (student.getRollNo().equals(rollNo)) {
                student.updateSubject(subjectIndex, newSubject);
                view.displayMessage("Subject updated successfully for " + student.getName());
                return;
            }
        }
        view.displayMessage("Student with Roll No: " + rollNo + " not found.");
    }

    // Display all students
    public void displayAllStudents() {
        view.printAllStudents(students);
    }

    // Display a single student's details
    public void displayStudent(String rollNo) {
        for (Student student : students) {
            if (student.getRollNo().equals(rollNo)) {
                view.printStudentDetails(student.getName(), student.getRollNo(), student.getSubjects());
                return;
            }
        }
        view.displayMessage("Student with Roll No: " + rollNo + " not found.");
    }
}
