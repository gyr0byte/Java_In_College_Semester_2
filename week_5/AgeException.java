
import java.util.Scanner;

public class AgeException {
    public static void checkAge(int age) throws ArithmeticException{
        if (age < 18){
            throw new ArithmeticException("Age shall be greater than 18");
        }
        System.out.println("Your age is " + age);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        try {
            checkAge(age);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Exception occured " + e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}
