package pkg73462_assignment1_6;
import java.util.Scanner;
//73462
public class Q6 {
    static void pattern(int n)
    {
        if (n <= 0)
        {
            System.out.println("Number of rows must be positive.");
        } else
        {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                System.out.print("*");
                }
            System.out.print("\n");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.print("Enter number of rows: ");
        n = scan.nextInt();
        pattern(n);
    }
}
