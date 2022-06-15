/*830: Write the program to:
 * a. Create class Ticket with: 
 * - Film Name (String)
 * - Price (real number type)
 * - Show time (datetime type)
 * - Date time (datetime type)
 * b. Calculate total price of tickets in list
 * c. Arrange a list by show time and date time with ascending order
 * */
package truong.e1000.ticketmanagement;

import truong.e1000.ticketmanagement.service.TicketManagementService;

public class TicketManagementApp {
    public static void main(String[] args) {
        TicketManagementService service = new TicketManagementService();
        System.out.println("1.Total price of ticket list: " + service.getTotalPriceofListTicket());
        System.out.println("===========================================================");

        System.out.println("\n2. Arrange ticket list by show time/date with ascending order: ");
        service.printTicketList(service.sortListByShowDateTime());
    }
}