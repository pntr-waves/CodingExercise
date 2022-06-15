package truong.e1000.flightmanagement.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import truong.e1000.flightmanagement.data.FlightDataTestingBuilder;
import truong.e1000.flightmanagement.model.Flight;

public class FlightManagementService {

    Map<LocalDate, Integer> getCounterByFlightDate() {
        Map<LocalDate, Integer> counter = new HashMap<>();
        List<Flight> flightList = FlightDataTestingBuilder.getFlightList();

        for (Flight flight : flightList) {
            if (counter.containsKey(flight.getFlightDate())) {
                int count = counter.get(flight.getFlightDate());
                counter.replace(flight.getFlightDate(), count + 1);
            } else {
                counter.put(flight.getFlightDate(), 1);
            }
        }

        return counter;
    }

    int getMaxFlightInDay(Map<LocalDate, Integer> counter) {
        int max = 0;
        for (Map.Entry<LocalDate, Integer> entry : counter.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }

        return max;
    }

    public void getDaysHasTheMostFlight() {
        Map<LocalDate, Integer> counter = getCounterByFlightDate();
        int max = getMaxFlightInDay(counter);
        for (Map.Entry<LocalDate, Integer> entry : counter.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println("\t" + entry.getKey());
            }
        }
    }

    public Flight getFlightByFlightCode(String flightCode) {
        List<Flight> flightList = FlightDataTestingBuilder.getFlightList();
        sortFlightListByFlightCode(flightList, 0, flightList.size() - 1);
        return getFlightByFlightCode(flightList, flightCode, 0, flightList.size() - 1);
    }

    private Flight getFlightByFlightCode(List<Flight> flightList, String flightCode, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;

            if (flightList.get(mid).getFlightCode().compareTo(flightCode.trim()) == 0) {
                return flightList.get(mid);
            }

            if (flightList.get(mid).getFlightCode().compareTo(flightCode.trim()) > 0) {
                return getFlightByFlightCode(flightList, flightCode, left, mid - 1);
            }
            return getFlightByFlightCode(flightList, flightCode, mid + 1, right);
        }

        return null;
    }

    void sortFlightListByFlightCode(List<Flight> flightList, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sortFlightListByFlightCode(flightList, left, mid);
            sortFlightListByFlightCode(flightList, mid + 1, right);

            mergeByFlightCode(flightList, left, mid, right);
        }
    }

    private void mergeByFlightCode(List<Flight> flightList, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        List<Flight> leftArr = new ArrayList<>();
        List<Flight> rightArr = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            leftArr.add(flightList.get(i + left));
        }

        for (int i = 0; i < n2; i++) {
            rightArr.add(flightList.get(i + mid + 1));
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArr.get(i).getFlightCode().compareTo(rightArr.get(j).getFlightCode()) < 0) {
                flightList.set(k, leftArr.get(i));
                i++;
            } else {
                flightList.set(k, rightArr.get(j));
                j++;
            }

            k++;
        }

        while (i < n1) {
            flightList.set(k, leftArr.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            flightList.set(k, rightArr.get(j));
            j++;
            k++;
        }
    }
}
