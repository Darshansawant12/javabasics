package package2;

public class Logicaloperator {
    public static void main(String[] args) {
        int num1= 10;
        int num2 = 40;

        int num3= 20;
        boolean result;

        result=(num1> num2)||(num3>num1);
        System.out.println(result);

        result=(num1>num2)&&(num3>num1);
        System.out.println(result);

    
        result=!(num1>num3);
        System.out.println(result);
    }

}
