/**
 * Write a program to manage list student by Binary tree with follow requirements:
 * 1. Create Student object with informations:
 * - Full Name
 * - Gender
 * - Birth date
 * - Address 
 * - E-mail
 * 2. Find a student has oldest age
 * 3. List all student
 */
package truong.e1000.studentbinarytree;

import truong.e1000.studentbinarytree.data.StudentBinaryTreeDataTestingBuilder;
import truong.e1000.studentbinarytree.model.BinaryTree;
import truong.e1000.studentbinarytree.service.StudentBinaryTreeDisplayService;
import truong.e1000.studentbinarytree.service.StudentBinaryTreeService;

public class StudentBinaryTreeApp {
    public static void main(String[] args) {
        BinaryTree studentBinaryTree = StudentBinaryTreeDataTestingBuilder.getStudentBinaryTree();
        StudentBinaryTreeDisplayService display = new StudentBinaryTreeDisplayService();
        StudentBinaryTreeService service = new StudentBinaryTreeService();
        
        System.out.println("List Student: ");
        display.printAllStudent(studentBinaryTree.root);
        
        System.out.println("\nThe oldest student: ");
        display.printStudent(service.getTheOldestStudent(studentBinaryTree.root));
    }
}
