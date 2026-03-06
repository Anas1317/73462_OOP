package pkg73462_week_2;

public class Book {
    int id, borrowId = 0;
    String title, author;
    String issueDate = "None", returnDate = "None";
    boolean isIssued = false;

    void setDetails(int s_id, String s_author, String s_title) {
        id = s_id;
        author = s_author;
        title = s_title;
    }

    void issueBook(int bId, String iDate, String rDate) {
        isIssued = true;
        borrowId = bId;
        issueDate = iDate;
        returnDate = rDate;
    }

    void printDetails() {
        System.out.println("Book ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (isIssued) {
            System.out.println("Borrowed by Student ID: " + borrowId);
            System.out.println("Issue Date: " + issueDate);
            System.out.println("Return Date: " + returnDate);
        }
    }
}
