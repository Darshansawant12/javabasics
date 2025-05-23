package package1;

public class Variable {
    public  void studentAge(){
        int age=0;
        age=age+30;
        System.out.println("Student age is:"+age);
    }
    public class StaticEx{
        public static double fees =45;
        public static String name="Darshan";
    }
    public static void main(String[] args) {
       Variable temp = new Variable();
       StaticEx temp1 = new Variable().new StaticEx();
        temp1.fees=45;
        temp1.name="Darshan";
        System.out.println("Student name is:"+temp1.name);
        temp.studentAge();  
        System.out.println("Student fees is:"+temp1.fees);
    }
}
