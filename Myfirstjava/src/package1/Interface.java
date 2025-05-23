package package1;
import java.io.*;
 interface testinterface {
 
    final int a= 10;
    int b= 20;
     static int c= 30;

    void display();
    void Method1();
    void Method2(); 
};
class testclass implements testinterface{

    public void display(){
        System.out.println("This is a test class");
    }
    public void Method1(){
        System.out.println("This is a test class");
    }
    public void Method2(){
        System.out.println("This is a test class");
    }
}
  class Interface{
    public static void main(String[] args){
        testclass t= new testclass();
        t.display();
        t.Method1();
        t.Method2();
        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(t.c);
    }
  }  

