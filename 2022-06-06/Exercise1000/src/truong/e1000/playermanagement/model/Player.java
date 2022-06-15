package truong.e1000.playermanagement.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Player {
    private String playerCode;
    private String playerName;
    private LocalDate birthDay;

    public Player(String playerCode, String playerName, String birthDay) {
        this.playerCode = playerCode;
        this.playerName = playerName;
        this.birthDay = LocalDate.parse(birthDay, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getPlayerCode() {
        return playerCode;
    }

    public void setPlayerCode(String playerCode) {
        this.playerCode = playerCode;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

}
