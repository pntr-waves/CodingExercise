/*828: Write a program with a following:
 * a. Declare a object presents for book with: 
 * - Book name: String type
 * - Author name: String type
 * - Publication Year: Integer type
 * b. Find an oldest book
 * c. Find years have the most published book and show all book was published in this year
 */
package truong.e1000.bookmanagement.model;

public class Book {
    private String bookName;
    private String authorName;
    private long publicationYear;

    public Book(String bookName, String authorName, long publicationYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public long getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(long publicationYear) {
        this.publicationYear = publicationYear;
    }
}
