package truong.e1000.memberbinarytree.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Member {
    private String code;
    private String name;
    private String address;
    private LocalDate registrationDate;
    
    public Member (String code, String name, String address, String registrationDate) {
        this.setCode(code);
        this.setName(name);
        this.setAddress(address);
        this.setRegistrationDate(LocalDate.parse(registrationDate, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
    
    
}
