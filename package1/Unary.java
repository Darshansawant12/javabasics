 package package1;
 class Unary{
    public static void main(String[] args) {
        int num1= 10;
        int num2= 32;
        double num = 10, resultnumber;
        boolean flag= false;

        System.out.println("+num1 = " + +num1);
        System.out.println("-num1 = " + -num1);
        System.out.println("++num1 = " + ++num1);
        System.out.println("!flag="+ flag);
        System.out.println(num++ );
        System.out.println(num);

        System.out.println(++num2);
        System.out.println(num2);

    }
}