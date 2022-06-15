package truong.e1000.bookmanagement.service;

import java.util.List;

import truong.e1000.bookmanagement.model.Book;

public class ManageBookDisplayService {
    
    public void printBookList (List<Book> bookList) {
        System.out.println("\nList of Book");
        for (Book book : bookList) {
            System.out.println("------------------------------------------------");
            System.out.println(String.format("Book Name: %s", book.getBookName()));
            System.out.println(String.format("Author Name: %s", book.getAuthorName()));
            System.out.println(String.format("Publication Year: %d", book.getPublicationYear()));
    
        }
    }

}
