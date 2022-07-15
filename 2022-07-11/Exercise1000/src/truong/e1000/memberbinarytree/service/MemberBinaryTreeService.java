package truong.e1000.memberbinarytree.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import truong.e1000.memberbinarytree.model.BinaryTree;
import truong.e1000.memberbinarytree.model.Member;
import truong.e1000.memberbinarytree.model.Node;

public class MemberBinaryTreeService {
    public Member getOldestMember (Node root) {
        Node temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        
        return temp.data;
    }
    
    public BinaryTree getMembersAfterRegistrationYear (Node root, int compareYear) {
        BinaryTree result = new BinaryTree();
        listMembersAfterRegistrationYear(root, compareYear, result);
        return result;
    }
    
    public void listMembersAfterRegistrationYear (Node root, int compareYear, BinaryTree result) {
        if (root == null) return;
        
        listMembersAfterRegistrationYear(root.left, compareYear, result);
        if (root.data.getRegistrationDate().getYear() > compareYear) {
            result.add(root.data);
        }
        listMembersAfterRegistrationYear(root.right, compareYear, result);
    }
    
    public int countMembersByRegistrationDate (Node root, String compareDate) {
        LocalDate d = LocalDate.parse(compareDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return countMembersByRegistrationDate(root, d);
    }
    
    public int countMembersByRegistrationDate (Node root, LocalDate compareDate) {
        if (root == null) return 0;
        
        int temp = 0;
        if (root.data.getRegistrationDate().equals(compareDate)) temp = 1;
        
        return temp + countMembersByRegistrationDate(root.left, compareDate) + countMembersByRegistrationDate(root.right, compareDate);
    }
    
    public Member findMembersByCode (Node root, String code) {
       if (root == null) return null;
       
       if (root.data.getCode().equals(code)) {
           return root.data;
       }
       
       Member leftRs = findMembersByCode(root.left, code);
       if (leftRs != null) return leftRs;
       
       Member rightRs = findMembersByCode(root.right, code);
       return rightRs;
    }
}
