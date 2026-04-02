import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter another number: ");
            int num2 = sc.nextInt();
            System.out.println("The division is: " + (num1 / num2));
            sc.close();
        } 
        catch (InputMismatchException e) {

        }
        System.out.println("Hello World!");
    }
}
