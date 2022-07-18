package truong.e1000.studentbinarytree.service;

import java.time.format.DateTimeFormatter;

import truong.e1000.studentbinarytree.model.Node;
import truong.e1000.studentbinarytree.model.Student;

public class StudentBinaryTreeDisplayService {
    public void printStudent (Student student) {
        System.out.println("------------------------------");
        System.out.println("Full name: " + student.getFullName());
        System.out.println("Gender: " + student.getGender().getTitle());
        System.out.println("BirthDate: " + student.getBirthdate().format(DateTimeFormatter.ofPattern("dd/MM/yyy")));
        System.out.println("Address: " + student.getAddress());
        System.out.println("Email: " + student.getEmail());
    }
    
    public void printAllStudent (Node root) {
        if (root == null) {
            return;
        }
        printAllStudent(root.left);
        printStudent(root.data);
        printAllStudent(root.right);
    }
}
