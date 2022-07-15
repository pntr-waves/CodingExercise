/**
 * 923. Manage list of member by binary tree with below requirement:
 * 1. Declare Reader object with informations:
 * - Member Code
 * - Member Name
 * - Address
 * - Registration date
 * 2. Find the oldest member
 * 3. List members has registration year is after 2020
 * 4. Count a member has registration date is 04/10/2019
 * 5. Find a member with member code
 */
package truong.e1000.memberbinarytree;

import truong.e1000.memberbinarytree.data.MemberBinaryTreeDataTestingBuilder;
import truong.e1000.memberbinarytree.model.BinaryTree;
import truong.e1000.memberbinarytree.service.MemberBinaryTreeDisplayService;
import truong.e1000.memberbinarytree.service.MemberBinaryTreeService;

public class MemberBinaryTreeApp {
    public static void main(String[] args) {
        BinaryTree memberTree = MemberBinaryTreeDataTestingBuilder.getMemberBinaryTree();
        MemberBinaryTreeDisplayService display = new MemberBinaryTreeDisplayService();
        MemberBinaryTreeService service = new MemberBinaryTreeService();
        
        System.out.println("1. List of member");
        display.printAllMember(memberTree.root);
        
        System.out.println("\n2. The oldest member:");
        display.printMember(service.getOldestMember(memberTree.root));
        
        int compareYear = 2020;
        System.out.println("\n3. List of member has birth year after 2020");
        display.printAllMember(service.getMembersAfterRegistrationYear(memberTree.root, compareYear).root);
        
        String compareDate = "04/10/2019";
        System.out.println("\n4. Has "+ service.countMembersByRegistrationDate(memberTree.root, compareDate) + " member has registration date is 04/10/2019");
        
        String findCode = "52343-046";
        System.out.println("\n5. Find Member with code: " + findCode);
        display.printMember(service.findMembersByCode(memberTree.root, findCode));
    }
}
