package truong.e1000.playermanagement.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import truong.e1000.playermanagement.data.PlayerDataTestingBuilder;
import truong.e1000.playermanagement.model.Player;

public class PlayerManagementService {
    
    int getYoungestAge (List<Player> playerList) {
    	sortByAge(playerList);
        return getPlayerAge(playerList.get(0).getBirthDay());
    }
    
    public List<Player> getYoungestPlayerList () {
        List<Player> playerList = PlayerDataTestingBuilder.getPlayerList();
        int yougestAge = getYoungestAge(playerList);
        System.out.println(yougestAge);
        List<Player> result = new ArrayList<>();
        
        for (Player player : playerList) {
            if (getPlayerAge(player.getBirthDay()) == yougestAge) {
                result.add(player);
            }
        }
        
        return result;
    }
    
    public List<Player> sortByBirthDay() {
        List<Player> playerList = PlayerDataTestingBuilder.getPlayerList();
        return sortByBirthDay(playerList);
    }
    
    void sortByAge (List<Player> playerList) {
        int length = playerList.size();
        
        for (int i = length / 2 - 1; i >= 0; i--) {
            heapifyByAge(playerList, length, i);
        }
        
        for (int i = length - 1; i > 0; i--) {
            Player temp = playerList.get(0);
            playerList.set(0, playerList.get(i));
            playerList.set(i, temp);
            heapifyByAge(playerList, i, 0);
        }
    }
    
    void heapifyByAge (List<Player> playerList, int length, int index) {
        int largest = index;
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        
        if (left < length && getPlayerAge(playerList.get(largest).getBirthDay()) < getPlayerAge(playerList.get(left).getBirthDay())) {
            largest = left;
        }
        
        if (right < length && getPlayerAge(playerList.get(largest).getBirthDay()) < getPlayerAge(playerList.get(right).getBirthDay())) {
            largest = right;
        }
        
        if (index != largest) {
            Player temp = playerList.get(largest);
            playerList.set(largest, playerList.get(index));
            playerList.set(index, temp);
            heapifyByAge(playerList, length, largest);
        }
    }

    List<Player> sortByBirthDay(List<Player> playerList) {
        int length = playerList.size();

        for (int i = length / 2 - 1; i >= 0; i--) {
            heapifyByBirthDay(playerList, length, i);
        }

        for (int i = length - 1; i > 0; i--) {
            Player temp = playerList.get(0);
            playerList.set(0, playerList.get(i));
            playerList.set(i, temp);
            heapifyByBirthDay(playerList, i, 0);
        }
        
        return playerList;
    }

    void heapifyByBirthDay(List<Player> playerList, int length, int index) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < length && playerList.get(largest).getBirthDay().isAfter(playerList.get(left).getBirthDay())) {
            largest = left;
        }

        if (right < length && playerList.get(largest).getBirthDay().isAfter(playerList.get(right).getBirthDay())) {
            largest = right;
        }

        if (largest != index) {
            Player temp = playerList.get(index);
            playerList.set(index, playerList.get(largest));
            playerList.set(largest, temp);

            heapifyByBirthDay(playerList, length, largest);
        }
    }

    public int getPlayerAge(LocalDate birthDay) {
        if (birthDay != null) {
            return Period.between(birthDay, LocalDate.now()).getYears();
        } else {
            return 0;
        }
    }

}
