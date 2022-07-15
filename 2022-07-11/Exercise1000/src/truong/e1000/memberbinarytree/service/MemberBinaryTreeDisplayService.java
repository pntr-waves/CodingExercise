package truong.e1000.memberbinarytree.service;

import java.time.format.DateTimeFormatter;

import truong.e1000.memberbinarytree.model.Member;
import truong.e1000.memberbinarytree.model.Node;

public class MemberBinaryTreeDisplayService {
    public void printAllMember (Node root) {
        if (root == null) return;
        
        printAllMember(root.left);
        printMember(root.data);
        printAllMember(root.right);
        
    }
    
    public void printMember (Member member) {
        System.out.println("------------------------------");
        System.out.println("MemberCode: " + member.getCode());
        System.out.println("Name: " + member.getName());
        System.out.println("Address: " + member.getAddress());
        System.out.println("Registration date: " + member.getRegistrationDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
} 
