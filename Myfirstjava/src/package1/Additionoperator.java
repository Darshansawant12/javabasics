package package1;
import java.util.Scanner;
// This program demonstrates the use of the addition operator in Java
// It adds two integers and prints the result
public class Additionoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = sc.nextInt();
        
        // Using the addition operator to add two numbers
        int sum = firstNumber + secondNumber;
        // int a = 10;
        // int b = 20;
        // int c = a + b; // Addition operator
        System.out.println("The sum of" +sum);
    }
}
