

package package2;
import java.io.*;
public class concatiate{
    public static void main (String[] args){
        String str1 = "Welcome";
        String str2 =" to the world of ";
        String str3 = "Java programming";

        String str4 = str1.concat("XYZ");
        String str5 = str1. concat(str2);
        String str6 = str1. concat(str2).concat(str3);
        String str7 = str1 + str2;

        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);

    }
}
