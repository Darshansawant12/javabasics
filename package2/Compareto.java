package package2;
public class Compareto{
    public static void main(String[] args) {
        String str1 = "Java 1";
        String str2 = " 'java'  d";

    // System.out.println(str1.compareTo(str2));
     System.out.println(str1.compareToIgnoreCase(str2));

     System.out.println(str1.startsWith("J"));
     System.out.println(str2.endsWith(""));
     System.out.println(str1.charAt(2));
     System.out.println(str1.trim());
     System.out.println(str2.repeat(7));
}
}