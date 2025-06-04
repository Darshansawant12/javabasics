// package package1;
// import java.io.*;
// public class concatiate {

//     public static void main(String[] args) {
//         String str1= "darshan";
//         String str2= "patel";
//         String str3= "is";
//         String str4 = str1.concat(str3).concat(str2);
//         String result = str1 + " " + str3 + " " + str2;
//         System.out.println("Concat string using concat method: "+ result);
//         System.out.println("concat: "+ str4);
//     }
// }

package package1;
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
