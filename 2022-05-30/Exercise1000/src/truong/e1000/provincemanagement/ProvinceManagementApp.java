/* 839. Write a program to the following:
 * a. Create Province object with: 
 * - Province Name: String type
 * - Area:  real number type
 * - Population: integer type
 * b. Calculation total area of provinces in list.
 * c. Find a province has the greatest area.
 * d. Sort a list with ascending order by area.
 * */

package truong.e1000.provincemanagement;

import truong.e1000.provincemanagement.service.ProvinceManageService;
import truong.e1000.provincemanagement.service.ProvinceManagementDisplayService;

public class ProvinceManagementApp {
    public static void main(String[] args) {
        ProvinceManageService service = new ProvinceManageService();
        ProvinceManagementDisplayService display = new ProvinceManagementDisplayService();
        System.out.println("1. Total Area: " + service.getTotalArea());
        System.out.println("==========================================");
        
        System.out.println("\n2. Provinces have greatest area:");
        System.out.println("==========================================");
        display.printProvinceList(service.getGreatestAreaProvinceList());
        
        System.out.println("\n3. Provinces have greatest population:");
        System.out.println("==========================================");
        display.printProvinceList(service.getGreatestPopulationProvinceList());
        
        System.out.println("\n4. Sort list of province by area with ascending");
        System.out.println("==========================================");
        display.printProvinceList(service.sortProvinceByArea());
    }
}
