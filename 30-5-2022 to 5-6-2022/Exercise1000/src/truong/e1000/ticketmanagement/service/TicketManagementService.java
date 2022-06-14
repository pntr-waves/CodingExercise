/*830: Write the program to:
 * a. Create class Ticket with: 
 * - Film Name (String)
 * - Price (real number type)
 * - Show time (datetime type)
 * - Date time (datetime type)
 * b. Calculate total price of tickets in list
 * c. Arrange a list by show time and date time with ascending order
 * */


package truong.e1000.ticketmanagement.service;

import java.util.ArrayList;
import java.util.List;

import truong.e1000.ticketmanagement.data.TicketDataTestingBuilder;
import truong.e1000.ticketmanagement.model.Ticket;

public class TicketManagementService {
    public void printTicketList(List<Ticket> ticketList) {
        System.out.println("\n List of Ticket");
        for (Ticket ticket : ticketList) {
            System.out.println("-----------------------------------------");
            System.out.println("Film Name: " + ticket.getFilmName());
            System.out.println("Price: " + ticket.getPrice());
            System.out.println("Show Time: " + ticket.getShowtime());
            System.out.println("Show Date: " + ticket.getShowdate());
        }
    }

    public double getTotalPriceofListTicket() {
        List<Ticket> ticketList = TicketDataTestingBuilder.getTicketList();

        double totalPrice = 0;
        for (Ticket ticket : ticketList) {
            totalPrice += ticket.getPrice();
        }

        return totalPrice;
    }

    public List<Ticket> sortListByShowDateTime() {
        List<Ticket> ticketList = TicketDataTestingBuilder.getTicketList();
        sortListByShowDateTime(ticketList, 0, ticketList.size() - 1);
        return ticketList;
    }

    void sortListByShowDateTime(List<Ticket> ticketList, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            sortListByShowDateTime(ticketList, left, mid);
            sortListByShowDateTime(ticketList, mid + 1, right);

            mergeByShowDateTime(ticketList, left, mid, right);
        }
    }

    private void mergeByShowDateTime(List<Ticket> ticketList, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        List<Ticket> lArr = new ArrayList<>();
        List<Ticket> rArr = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            lArr.add(ticketList.get(left + i));
        }

        for (int i = 0; i < n2; i++) {
            rArr.add(ticketList.get(mid + i + 1));
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (lArr.get(i).getShowdate().compareTo(rArr.get(j).getShowdate()) < 0) {
                ticketList.set(k, lArr.get(i));
                i++;
            } else if (lArr.get(i).getShowdate().compareTo(rArr.get(j).getShowdate()) > 0) {
                ticketList.set(k, rArr.get(j));
                j++;
            } else {
                if (lArr.get(i).getShowtime().compareTo(rArr.get(j).getShowtime()) < 0) {
                    ticketList.set(k, lArr.get(i));
                    i++;
                } else {
                    ticketList.set(k, rArr.get(j));
                    j++;
                }
            }

            k++;
        }

        while (i < n1) {
            ticketList.set(k, lArr.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            ticketList.set(k, rArr.get(j));
            j++;
            k++;
        }
    }
}
