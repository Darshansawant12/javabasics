package package1;
import java.io.*;
public class concatiate {

    public static void main(String[] args) {
        String str1= "darshan";
        String str2= "patel";
        String str3= "is";
        String str4 = str1.concat(str3).concat(str2);
        String result = str1 + " " + str3 + " " + str2;
        System.out.println("Concat string using concat method: "+ result);
        System.out.println("concat: "+ str4);
    }
}

