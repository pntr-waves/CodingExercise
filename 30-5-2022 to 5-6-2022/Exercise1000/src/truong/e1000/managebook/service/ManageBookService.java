//Viết chương trình thực hiện các yêu cầu sau:
//a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các quyển
//sách. Biết rằng thông tin của một quyển sách bao gồm: tên sách (50
//ký tự), tên tác giả (30 ký tự) và năm xuất bản.
//b. Cài đặt tất cả các thao tác cơ bản cho danh sách liên kết các quyển
//sách.
//c. Tìm quyển sách cũ nhất trong danh sách liên kết.
//d. Tìm một năm có nhiều sách xuất bản nhất và liệt kê tất cả các quyển
//sách xuất bản trong năm đó.

package truong.e1000.managebook.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import truong.e1000.managebook.data.DataTestingBuilder;
import truong.e1000.managebook.model.Book;

public class ManageBookService {
    public Book getOldestBook() {
        List<Book> bookList = DataTestingBuilder.getBookList();
        Book oldestBook = bookList.get(0);
        for (Book book : bookList) {
            if (book.getPublicationYear() < oldestBook.getPublicationYear()) {
                oldestBook = book;
            }
        }
        
        return oldestBook;
    }
    
    Map<Long, Integer> countBooksByPublicationYear() {
        Map<Long, Integer> bookCounter = new HashMap<>();
        List<Book> bookList = DataTestingBuilder.getBookList();
        
        for (Book book : bookList) {
            if (bookCounter.containsKey(book.getPublicationYear())) {
                int count = bookCounter.get(book.getPublicationYear());
                bookCounter.replace(book.getPublicationYear(), count + 1);
            } else {
                bookCounter.put(book.getPublicationYear(), 1);
            }
        }
        return bookCounter; 
    }
    
}
