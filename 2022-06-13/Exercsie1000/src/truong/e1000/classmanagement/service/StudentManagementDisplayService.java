package truong.e1000.classmanagement.service;

import java.util.List;

import truong.e1000.classmanagement.model.Student;

public class StudentManagementDisplayService {
    
    public void printStudentList (List<Student> studentList) {
        System.out.println("List of Student");
        for (Student student : studentList) {
            System.out.println("\t--------------------------------");
            System.out.println("\tName: " + student.getName());
            System.out.println("\tAverage: " + student.getAverage());
        }
    }
    
    public void printStudent (Student student) {
        System.out.println("\t--------------------------------");
        System.out.println("\tName: " + student.getName());
        System.out.println("\tAverage: " + student.getAverage());
    }
}
