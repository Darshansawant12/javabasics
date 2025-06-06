package package2;
import java.io.*;
public class Ass1 {

    public static void main(String[] args) {
        String str1= "he great mystery of Flashlight isnt so much what happened as why, the concatenation of secrets, silences, and unlikely geopolitical inputs that leads to a familys dissolution.";
        String str2= "patel";
        String str3= "is";
        //opertaor
        int a=10;
        int b=20;

         //add
        int sum = a + b;

        //substarct
        int difference = a-b;

        //multiply
        int product = a*b;

        //divide
        int quotient =a/b;

        //modulus
        int remainder = a%b;    

        //increment 
        a++;

        //decrement
        b--;

        str1.toCharArray();
        System.out.println("String to char array: " + java.util.Arrays.toString(str1.toCharArray()));
        System.out.println(str1.compareToIgnoreCase(str2));
        int length= str1.length();
        System.out.println("Length of the string: " + length);
        String str4= str1.concat(" " + str2);
        System.out.println("concatinate string:"+ str4);
        
        System.out.println("Sum of a and b: " + sum);
        System.out.println("Difference of a and b: " + difference);
        System.out.println("Product of a and b: " + product);
        System.out.println("Quotient of a and b: " + quotient);
        System.out.println("Remainder of a and b: " + remainder);
        System.out.println("Incremented value of a: " + a);
        System.out.println("Decremented value of b: " + b);
        
    }
}