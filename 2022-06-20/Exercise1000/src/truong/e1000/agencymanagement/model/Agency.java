package truong.e1000.agencymanagement.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Agency {
    private String agencyCode;
    private String agencyName;
    private String phoneNumber;
    private LocalDate establishDate;
    private String address;

    public Agency (String agencyCode, String agencyName, String phoneNumber, String establishDate, String address) {
        this.agencyCode = agencyCode;
        this.agencyName = agencyName;
        this.phoneNumber = phoneNumber;
        this.establishDate = LocalDate.parse(establishDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.address = address;
    }
    
    public String getAgencyCode() {
        return agencyCode;
    }

    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getEstablishDate() {
        return establishDate;
    }

    public void setEstablishDate(LocalDate establishDate) {
        this.establishDate = establishDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
