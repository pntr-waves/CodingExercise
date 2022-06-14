/*832. Write a program to with following:
 * a. Create Flight object with: 
 * - Flight code: String type
 * - Flight date: datetime type
 * - Flight time: datetime type
 * - To: String type
 * - From: String type
 * b. Find a day has the most flight
 * c. Find a flight by flight code 
 */
package truong.e1000.flightmanagement;

import java.util.Scanner;

import truong.e1000.flightmanagement.service.FlightManagementService;

public class FlightManagementApp {
    public static void main(String[] args) {
        FlightManagementService service = new FlightManagementService();
        System.out.println("1. Days have the most flight: ");
        System.out.println("=========================================================");
        service.getDaysHasTheMostFlight();

        System.out.println("\n2.Find The Flight: ");
        System.out.println("=========================================================");
        System.out.print("\tEnter Flight Code: ");
        Scanner sc = new Scanner(System.in);
        String flightCode = sc.next();
        service.printFlight(service.getFlightByFlightCode(flightCode));
    }
}
