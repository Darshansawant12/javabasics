// package package1;
// public class CharArray{
//     public static void main(String[] args) {
//         String str1= "Java Programming";
//         str1.toCharArray();
//          System.out.println("String to char array: " + java.util.Arrays.toString(str1.toCharArray()));
//          System.out.println(str1.compareToIgnoreCase(str1));
//     }
// }

package package1;
public class CharArray {

    public static void main(String[] args) {
        String s ="Iot";
        char[] chars = s.toCharArray();
        System.out.println("char["+ chars.length +"]{");
        for (int i= 0; i < chars.length;i++){
            System.out.println(""+ chars[i]+"");
            if (i< chars.length -1){
                System.out.println(",");
            }
        }
        System.out.println("}");
    }
}