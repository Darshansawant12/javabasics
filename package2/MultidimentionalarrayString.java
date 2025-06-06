package package2;

public class MultidimentionalarrayString {
    public static void main(String[] args) {
        String array[][]={
            {"apple", "banana", "cherry"},
            {"dog", "elephant", "frog"},

        };
        String clonearray[][] = array.clone();

        System.out.println(array[0]== clonearray[0]);
        System.out.println(array[1]== clonearray[1]);

        System.out.println("array element: " + array[0][0] + ", " + array[0][1] + ", " + array[0][2]);
        System.out.println("array element: " + array[1][0] + ", " + array[1][1] + ", " + array[1][2]);
    }
}
