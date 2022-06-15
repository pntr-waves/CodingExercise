package truong.e1000.essaymanagement.service;

import java.util.List;

import truong.e1000.essaymanagement.model.Essay;

public class EssayManagementDisplayService {
    public void printEssayList (List<Essay> essayList) {
        System.out.println("Essay List: ");
        
        for (Essay essay : essayList) {
            System.out.println("--------------------------------------------------");
            System.out.println("Code: " + essay.getCode());
            System.out.println("Essay Name: " + essay.getEssayName());
            System.out.println("Student: " + essay.getStudentName());
            System.out.println("Teacher: " + essay.getTeacherName());
            System.out.println("Year: " + essay.getYear() );
        }
    }
}
