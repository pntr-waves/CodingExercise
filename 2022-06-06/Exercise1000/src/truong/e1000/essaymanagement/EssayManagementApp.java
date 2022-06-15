/*836. Write a program with below requirements:
 *a. Create Essay object with its properties: 
 *- Essay Code: sequence character type
 *- Essay Name: sequence character type
 *- Full name of student: sequence character type
 *- Full name of teacher: sequence character type
 *- Year: integer type
 *b. Show years have the most essay
 *c. Show essays by year
 */
package truong.e1000.essaymanagement;

import truong.e1000.essaymanagement.service.EssayManagementDisplayService;
import truong.e1000.essaymanagement.service.EssayManagementService;

public class EssayManagementApp {
    public static void main(String[] args) {
        EssayManagementService service = new EssayManagementService();
        EssayManagementDisplayService display = new EssayManagementDisplayService();
        System.out.println("1. Year has the most number of essay: " + service.getMostEssayYear());
        System.out.println("=============================================================");
        System.out.println("\n2. List essay in 2022");
        System.out.println("=============================================================");
        display.printEssayList(service.getListEssayByYear(2022));
    }
}
