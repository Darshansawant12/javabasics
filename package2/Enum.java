package package2;
 import java.time.DayOfWeek;
 import java.time.LocalDate;

public class Enum { 
    enum day{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        public static day dayfromjavaday(DayOfWeek day){
            return
            Enum.day.valueOf(day.name());

        }
    }

    public static void main(String[] args) {
        LocalDate today= LocalDate.now();
        DayOfWeek javaDay = today.getDayOfWeek();

        day todayENum = day.dayfromjavaday(javaDay);
        System.out.println("Today is: " + todayENum);
    }
    
}
