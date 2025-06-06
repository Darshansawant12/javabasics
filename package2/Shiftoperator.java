package package2;

public class Shiftoperator {
    public static void main(String[] args) {
        int a = 50;
        int b = 30;
        int c = 20;

        // Left shift operator
        c=a>>1;
        System.out.println("a>>2 ="+c);

        // Right shift operator
        c=b<<1;
        System.out.println("a<<2 ="+c);
    }
}
