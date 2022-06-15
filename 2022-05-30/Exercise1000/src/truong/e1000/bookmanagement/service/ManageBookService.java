package truong.e1000.bookmanagement.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import truong.e1000.bookmanagement.data.DataTestingBuilder;
import truong.e1000.bookmanagement.model.Book;

public class ManageBookService {
    long getOldestPublicationYear (List<Book> bookList) {
        sortByPublicationYear(bookList, 0, bookList.size() - 1);        
        return bookList.get(0).getPublicationYear();
    }
    
    public List<Book> getListOldestPublicationYearBook () {
        List<Book> bookList = DataTestingBuilder.getBookList();
        long oldestPublicationYear = getOldestPublicationYear(bookList);
        List<Book> result = getListBookByPublicationYear(oldestPublicationYear);
       
        return result;
    }
    
    public List<Book> getListBookByPublicationYear (long publicationYear) {
        List<Book> bookList = DataTestingBuilder.getBookList();
        List<Book> result = new ArrayList<>();
        
        for (Book book : bookList) {
            if (book.getPublicationYear() == publicationYear) {
                result.add(book);
            }
        }
        return result;
    }
    
    Map<Long, Integer> countBooksByPublicationYear () {
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
    
    public List<Long> getYearsWithMostBookPublished () {
        Map<Long, Integer> bookCount = countBooksByPublicationYear();
        List<Long> rs = new ArrayList<Long>();
        long max = 0;
        
        for (Map.Entry<Long, Integer> entry : bookCount.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        
        for (Map.Entry<Long, Integer> entry : bookCount.entrySet()) {
            if (entry.getValue() == max) {
                rs.add(entry.getKey());
            }
        }
        
        return rs;
    }

    void sortByPublicationYear (List<Book> bookList, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            
            sortByPublicationYear(bookList, left, mid);
            sortByPublicationYear(bookList, mid + 1, right);
            
            mergeByPublicationYear(bookList, left, mid, right);
        }
    }
    
    void mergeByPublicationYear (List<Book> bookList, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        List<Book> leftArr = new ArrayList<>();
        List<Book> rightArr = new ArrayList<>();
        
        for (int i = 0; i < n1; i++) {
            leftArr.add(bookList.get(left + i));
        }
        
        for (int i = 0; i < n2; i++) {
            rightArr.add(bookList.get(mid + 1 + i));
        }
        
        int i, j;
        i = j = 0;
        int k = left;
        
        while (i < n1 && j < n2) {
            if (leftArr.get(i).getPublicationYear() < rightArr.get(j).getPublicationYear()) {
                bookList.set(k, leftArr.get(i));
                i++;
            } else {
                bookList.set(k, rightArr.get(j));
                j++;
            }
            
            k++;
        }
        
        while (i < n1) {
            bookList.set(k, leftArr.get(i));
            i++;
            k++;
        }
        
        while (j < n2) {
            bookList.set(j, rightArr.get(j));
            j++;
            k++;
        }
    }
    
}
