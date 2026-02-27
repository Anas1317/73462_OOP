import java.util.Scanner;
//73462
public class Q4 {
    static int factorial(int n) {
        if (n == 0)
        {
            return 1;
        }
        else if (n > 0)
        {
            int res = 1;
            for (int i = 1; i <= n; i++)
            {
                res *= i;
            }
            return res;
        }
        else
        {
            return -1;
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        int res = factorial(n);

        if (res == -1)
        {
            System.out.println("Factorial is not defined for negative numbers.");
        }
        else
        {
            System.out.println("Factorial of " + n + " is: " + res);
        }
    }
}
