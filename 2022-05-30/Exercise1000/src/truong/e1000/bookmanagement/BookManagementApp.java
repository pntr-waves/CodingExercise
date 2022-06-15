/*828: Write a program with a following:
 * a. Declare a object presents for book with: 
 * - Book name: String type
 * - Author name: String type
 * - Publication Year: Integer type
 * b. Find an oldest book
 * c. Find years have the most published book and show all book was published in this year
 */
package truong.e1000.bookmanagement;

import java.util.List;

import truong.e1000.bookmanagement.service.ManageBookDisplayService;
import truong.e1000.bookmanagement.service.ManageBookService;

public class BookManagementApp  {
    public static void main(String[] args) {
        ManageBookService service = new ManageBookService();
        ManageBookDisplayService display = new ManageBookDisplayService();
        System.out.println("1. Oldest Publication Year Book:");
        System.out.println("===================================");
        display.printBookList(service.getListOldestPublicationYearBook());
        System.out.println("\n2. Find Publication Year with the most book published:");
        System.out.println("===================================");
        List<Long> yearList = service.getYearsWithMostBookPublished();
        for (long year : yearList) {
            System.out.println("Most published book in " + year);
            display.printBookList(service.getListBookByPublicationYear(year));
        }
    }
    
}
    