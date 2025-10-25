import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Time time = new Time(15,23,45);
        System.out.println("universal format : "+time.toUniversalString());
        System.out.println("standart format : "+time.toString());
        // zaman guncel
        time.setHour(17);
        time.setMinute(24);
        time.setSecond(1);
        System.out.println("the new time is :");
        // guncel zaman yazdir
        System.out.println("universal format : "+time.toUniversalString());
        System.out.println("standart format : "+time.toString());

        Employee employee = new Employee(25, "ali");
        employee.getInfo(); // counter neden tek basina yazdiramiyorum

        ExceptionHandling handler = new ExceptionHandling();
        int result = handler.readInteger();
        System.out.println("you entered: "+result);
    }
}