package truong.e1000.playermanagement.service;

import java.util.List;

import truong.e1000.playermanagement.model.Player;

public class PlayerManagementDisplayService {
    
	static PlayerManagementService service = new PlayerManagementService();
	
    public void printPlayerList (List<Player> playerList) {
        System.out.println("Player List: ");
        for (Player player : playerList) {
            System.out.println("--------------------------------------------------");
            System.out.println("Player Code: " + player.getPlayerCode());
            System.out.println("Player Name: " + player.getPlayerName());
            System.out.println("Birthday: " + player.getBirthDay());
            System.out.println("Age:" + service.getPlayerAge(player.getBirthDay()));
        }
    }
}
