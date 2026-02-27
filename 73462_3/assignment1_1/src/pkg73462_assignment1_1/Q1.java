package pkg73462_assignment1_1;
import java.util.Scanner;
//73462
public class Q1 {
    static boolean isPrime(int n)
    {
        if (n <= 1)
        {
            return false;
        }
        else if (n == 2 || n == 3)
        {
            return true;
        }
        else
        {
            boolean prime = true;
            for (int i = 2; (i * i) <= n; i++)
            {
                if (n % i == 0)
                {
                    prime = false;
                    break;
                }
            }
            return prime;
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = scan.nextInt();
        if (isPrime(num))
        {
            System.out.println(num + " is a prime number.");
        }
        else
        {
            System.out.println(num + " is not a prime number.");
        }
    }
    
}
