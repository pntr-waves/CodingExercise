package truong.e1000.flightmanagement.service;

import java.util.List;

import truong.e1000.flightmanagement.model.Flight;

public class FlightManagementDisplayService {
    public void printFlight(Flight flight) {
        if (flight != null) {
            System.out.println("\t-------------------------------------------------------");
            System.out.println("\tFlight Code: " + flight.getFlightCode());
            System.out.println("\tTime: " + flight.getFlightTime());
            System.out.println("\tDate: " + flight.getFlightDate());
            System.out.println("\tTo: " + flight.getTo());
            System.out.println("\tFrom: " + flight.getFrom());
        }
    }

    public void printFlightList(List<Flight> flightList) {
        for (Flight flight : flightList) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Flight Code: " + flight.getFlightCode());
            System.out.println("Time: " + flight.getFlightTime());
            System.out.println("Date: " + flight.getFlightDate());
            System.out.println("To: " + flight.getTo());
            System.out.println("From: " + flight.getFrom());
        }
    }
}
