package pkg73462_assignment1_5;
import java.util.Scanner;
//73462
public class Q5 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter first number: ");
        num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        num2 = scan.nextInt();
        System.out.println("Current num1: " + num1);
        System.out.println("Current num2: " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping with temp num1: " + num1);
        System.out.println("After swapping with temp num2: " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping without temp num1: " + num1);
        System.out.println("After swapping without temp num2: " + num2);
    }
}
