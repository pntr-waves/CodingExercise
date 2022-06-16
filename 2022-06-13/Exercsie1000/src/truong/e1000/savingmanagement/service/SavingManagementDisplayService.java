package truong.e1000.savingmanagement.service;

import truong.e1000.savingmanagement.model.Saving;

public class SavingManagementDisplayService {
    public void printSaving (Saving saving) {
        System.out.println("----------------------------------");
        System.out.println("Code Number: " + saving.getCode());
        System.out.println("Saving Type: " + saving.getSavingType().getType());
        System.out.println("Customer's Full Name: " + saving.getCustomerName());
        System.out.println("Id Card Number: " + saving.getIdCardNumber());
        System.out.println("Created Date: " + saving.getCreateDate());
    }
}
