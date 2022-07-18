package truong.e1000.studentbinarytree.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import truong.e1000.studentbinarytree.constant.Gender;

public class Student {
    private String fullName;
    private Gender gender;
    private LocalDate birthdate;
    private String address;
    private String email;
    
    public Student (String fullName, Gender gender, String birthdate, String address, String email) {
        this.setFullName(fullName);
        this.setGender(gender);
        this.setBirthdate(LocalDate.parse(birthdate, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        this.setAddress(address);
        this.setEmail(email);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
