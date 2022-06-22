package truong.e1000.agencymanagement.service;

import java.util.List;

import truong.e1000.agencymanagement.model.Agency;

public class AgencyManagementDisplayService {
    public void printAgencys (List<Agency> agencys) {
        System.out.println("List of Agency");
        for (Agency agency : agencys) {
            printAgency(agency);
        }
    }
    
    public void printAgency (Agency agency) {
        if (agency != null) {
            System.out.println("-----------------------------------------");
            System.out.println("Code: " + agency.getAgencyCode());
            System.out.println("Name: " + agency.getAgencyName());
            System.out.println("Phone Number: " + agency.getPhoneNumber());
            System.out.println("Address: " + agency.getAddress());
            System.out.println("Establish: " + agency.getEstablishDate());
        } else {
            System.out.println("Nothing");
        }
    }
    
}
