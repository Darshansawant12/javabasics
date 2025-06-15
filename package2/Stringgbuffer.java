package package2;

public class Stringgbuffer{
    public static void main(String[] args){
        StringBuffer str= new StringBuffer("cook");
        str.append("Emergency");
        System.out.println(str);
        
        str.insert(9,"Tech");
        System.out.println(str);

        str.replace(10,24,"IOT");
        System.out.println(str);

        str.reverse();
        System.out.println(str);

        System.out.println(str.capacity());
}
}