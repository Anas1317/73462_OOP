package pkg73462_week_2;
import java.util.Scanner;
//74362
public class Library {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Book b1 = new Book();
        Book b2 = new Book();
        Student s1 = new Student();

        int bookId;

        b1.setDetails(1, "Tolkin", "Lord of the Rings: The Fellowship of the Ring");
        b2.setDetails(2, "Frank Herbert", "Dune");
        s1.setData(73462, "Anas");
        b1.printDetails();
        b2.printDetails();

        System.out.println("Enter the book ID to issue: ");
        bookId = scan.nextInt();

        if (bookId == b1.id && !b1.isIssued) {
            b1.issueBook(s1.studentId, "2024-06-01", "2024-06-15");
            s1.bookId = b1.id;
            b1.printDetails();
            System.out.println("Book issued successfully");
        } else if (bookId == b2.id && !b2.isIssued) {
            b2.issueBook(s1.studentId, "2024-06-01", "2024-06-15");
            s1.bookId = b2.id;
            b2.printDetails();
            System.out.println("Book issued successfully");
        } else {
            System.out.println("Book ID not found or already issued.");
        }
    }
}
