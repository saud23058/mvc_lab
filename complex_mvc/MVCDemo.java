// MVCDemo.java

import controllor.StudentController;
import view.StudentView;

public class MVCDemo {
  public static void main(String[] args) {
      StudentView view = new StudentView();
      StudentController controller = new StudentController(view);

     
      controller.addStudent("Saud", "001");
      controller.addStudent("Asad", "002");

   
      controller.addSubjectToStudent("001", "Math");
      controller.addSubjectToStudent("001", "Physics");
      controller.addSubjectToStudent("002", "Chemistry");

      controller.displayAllStudents();

   
      controller.displayStudent("001");

    
      controller.updateStudentName("001", "Alice Cooper");

   
      controller.updateSubject("001", 0, "Advanced Math");

   
      controller.displayStudent("001");
  }
}
