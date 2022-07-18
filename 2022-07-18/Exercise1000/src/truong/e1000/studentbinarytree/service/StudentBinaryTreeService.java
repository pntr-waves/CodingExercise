package truong.e1000.studentbinarytree.service;

import truong.e1000.studentbinarytree.model.Node;
import truong.e1000.studentbinarytree.model.Student;

public class StudentBinaryTreeService {
    public Student getTheOldestStudent (Node root) {
        if (root == null) return null;
        
        Student currStudent = root.data;
        Student leftStudent = getTheOldestStudent(root.left);
        Student rightStudent = getTheOldestStudent(root.right);
        
        if (leftStudent != null && currStudent.getBirthdate().isAfter(leftStudent.getBirthdate())) {
            currStudent = leftStudent;
        }
        
        if (rightStudent != null && currStudent.getBirthdate().isAfter(rightStudent.getBirthdate())) {
            currStudent = rightStudent;
        }
        
        return currStudent;
    }
}
