package pkg73462_assignment1_3;
import java.util.Scanner;
//73462
public class Q3 {
    static boolean isPalindrome(int num)
    {
        if (num < 0) //-ve numbers aren't palindromes
        {
            return false;
        }

        int origunal = num;
        int reverse = 0;

        while (num > 0)
        {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        if (origunal == reverse)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = scan.nextInt();
        if (isPalindrome(num))
        {
            System.out.println(num + " is a palindrome.");
        }
        else
        {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
