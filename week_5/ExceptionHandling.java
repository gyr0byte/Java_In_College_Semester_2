import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void divide(int num1, int num2) throws IOException{
        if(num2 == 0){
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        if(num1 < 0 || num2 < 0){
            throw new IOException("Negative numbers are not allowed.");
        }
        System.out.println("The division is: " + (num1 / num2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter another number: ");
        int num2 = sc.nextInt();
        try{
            divide(num1, num2);
        }
        catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch(IOException e){
            System.out.println("Error: An I/O error occurred.");
        }
        catch(Exception e){
            System.out.println("An unexpected error occurred.");
        }
        sc.close();
    }
}
