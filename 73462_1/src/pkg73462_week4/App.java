package pkg73462_week4;
import java.util.Scanner;
//73462
public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        cal1 c1 = new cal1();
        cal2 c2 = new cal2();
        
        System.out.println("Enter a number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter a  second number: ");
        int num2 = scan.nextInt();

        System.out.println("The sum is: " + c1.sum(num1, num2));
        System.out.println("The product is: " + c1.mul(num1, num2));
        
        System.out.println("The difference is: " + c2.sub(num1, num2));
        System.out.println("The quotient is: " + c2.div(num1, num2));
    }
}
