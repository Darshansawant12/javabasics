package package2;

public class Lengthfunctionstringmethod {
    public static void main(String[] args) {
        //String declaration without using new operator
        String a="Cooking";
        System.out.println("String a ="+ a);
        
        //String declaration using new operator
        String b = new String("iot");
        System.out.println("String b=" +b);

        System.out.println("The length of string a is: " + a.length());
        System.out.println("The length of string b is: " + b.length());
        System.out.println(a.toUpperCase());
        System.out.println(b.toLowerCase());
    }
}
