package truong.e1000.classmanagement.service;

import truong.e1000.classmanagement.model.Class;

public class ClassManagementDisplayService {
    
    static StudentManagementDisplayService studentDisplay = new StudentManagementDisplayService();
    
    public void printClass (Class clazz) {
        System.out.println("-----------------------------");
        System.out.println("Class: " + clazz.getClassName());
        System.out.println("Student Number: " + clazz.getStudentNumber());
        studentDisplay.printStudentList(clazz.getStudentList());
    }
}
