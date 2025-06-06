package package2;
import java.util.Arrays;
import java.util.Scanner;
public class Singledimarrayuser1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of element");
        
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        
        String[] array = new String [n];

        for(int i=0; i<n; i++){
            System.out.println("Enter the element " + (i + 1) + ":");
            array[i]=sc.nextLine();
        }
        System.out.println("your array;" + Arrays.toString(array));
    }
}