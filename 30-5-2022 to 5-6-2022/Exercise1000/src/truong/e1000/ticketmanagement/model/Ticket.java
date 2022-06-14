/*830: Write the program to:
 * a. Create class Ticket with: 
 * - Film Name (String)
 * - Price (real number type)
 * - Show time (datetime type)
 * - Date time (datetime type)
 * b. Calculate total price of tickets in list
 * c. Arrange a list by show time and date time with ascending order
 * */

package truong.e1000.ticketmanagement.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ticket {
    private String filmName;
    private double price;
    private LocalTime showtime;
    private LocalDate showdate;

    public Ticket(String filmName, double price, String showtime, String showdate) {
        this.filmName = filmName;
        this.price = price;
        this.showtime = LocalTime.parse(showtime, DateTimeFormatter.ofPattern("HH:mm"));
        this.showdate = LocalDate.parse(showdate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalTime getShowtime() {
        return showtime;
    }

    public void setShowtime(LocalTime showtime) {
        this.showtime = showtime;
    }

    public LocalDate getShowdate() {
        return showdate;
    }

    public void setShowdate(LocalDate showdate) {
        this.showdate = showdate;
    }
}
