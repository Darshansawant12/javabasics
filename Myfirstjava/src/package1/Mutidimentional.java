package package1;

public class Mutidimentional {
    
    public static void main(String[] args) {
        //multidimensional array declaration
        int[][] arr;
        //initiative the size of row and column respectively
        arr = new int[1][3];
    
    //initializing the values
    arr[0][0]=3;
    arr[0][1]=5;
    arr[0][2]=7;
    //display the values using index
    System.out.println("array[0][0] ="+ arr[0][0]);
    System.out.println("array[0][1] ="+ arr[0][1]);
    System.out.println("array[0][2] ="+ arr[0][2]); 
    }
}
