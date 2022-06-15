/** 
 * 833.Write the program with the following: 
 * a. Declare object to represent Player with below informations: 
 * - Player code: sequence character type
 * - Player name: sequence character type
 * - Player's birth day: datetime type
 * b. List youngest player
 * c. Sort the list of player by birth day with descending order
 */
package truong.e1000.playermanagement;

import truong.e1000.playermanagement.service.PlayerManagementDisplayService;
import truong.e1000.playermanagement.service.PlayerManagementService;

public class PlayerManagementApp {
    public static void main(String[] args) {
        PlayerManagementService service = new PlayerManagementService();
        PlayerManagementDisplayService display = new PlayerManagementDisplayService();
        System.out.println("1. List of youngest player: ");
        System.out.println("=======================================================");
        display.printPlayerList(service.getYoungestPlayerList());
        System.out.println("\n2. sort player list: ");
        System.out.println("=======================================================");
        display.printPlayerList(service.sortByBirthDay());

    }
}
