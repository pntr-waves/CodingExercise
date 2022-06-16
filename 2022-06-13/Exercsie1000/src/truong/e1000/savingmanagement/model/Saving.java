package truong.e1000.savingmanagement.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import truong.e1000.savingmanagement.constant.SavingType;

public class Saving {
    private String code;
    private SavingType savingType;
    private String customerName;
    private String idCardNumber;
    private LocalDate createDate;
    private double savingMoney;

    public Saving (String code, SavingType savingType, String customerName, String idCardNumber, String createDate, double savingMoney) {
        this.code = code;
        this.savingType = savingType;
        this.customerName = customerName;
        this.idCardNumber = idCardNumber;
        this.createDate = LocalDate.parse(createDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.savingMoney = savingMoney;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public SavingType getSavingType() {
        return savingType;
    }

    public void setSavingType(SavingType savingType) {
        this.savingType = savingType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public double getSavingMoney() {
        return savingMoney;
    }

    public void setSavingMoney(double savingMoney) {
        this.savingMoney = savingMoney;
    }
}
