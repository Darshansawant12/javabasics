package package1;
import java.util.Scanner;
public class Substractionoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = sc.nextInt();
        int sum = firstNumber - secondNumber;
        System.out.println("The sum of" + sum);
    }
}
