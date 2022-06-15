package truong.e1000.ticketmanagement.service;

import java.util.ArrayList;
import java.util.List;

import truong.e1000.ticketmanagement.data.TicketDataTestingBuilder;
import truong.e1000.ticketmanagement.model.Ticket;

public class TicketManagementService {

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

        List<Ticket> leftArr = new ArrayList<>();
        List<Ticket> rightArr = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            leftArr.add(ticketList.get(left + i));
        }

        for (int i = 0; i < n2; i++) {
            rightArr.add(ticketList.get(mid + i + 1));
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArr.get(i).getShowdate().compareTo(rightArr.get(j).getShowdate()) < 0) {
                ticketList.set(k, leftArr.get(i));
                i++;
            } else if (leftArr.get(i).getShowdate().compareTo(rightArr.get(j).getShowdate()) > 0) {
                ticketList.set(k, rightArr.get(j));
                j++;
            } else {
                if (leftArr.get(i).getShowtime().compareTo(rightArr.get(j).getShowtime()) < 0) {
                    ticketList.set(k, leftArr.get(i));
                    i++;
                } else {
                    ticketList.set(k, rightArr.get(j));
                    j++;
                }
            }

            k++;
        }

        while (i < n1) {
            ticketList.set(k, leftArr.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            ticketList.set(k, rightArr.get(j));
            j++;
            k++;
        }
    }
}
