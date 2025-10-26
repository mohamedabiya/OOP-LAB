import java.io.InvalidClassException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Worker worker1 = new Worker("ali",123456789,15.5f,40);

        // the second user's information from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("enter SSN");
        int ssn = scanner.nextInt();
        System.out.println("enter wage");
        float wage = scanner.nextFloat();
        System.out.println("enter working hours");
        int hours = scanner.nextInt();
        scanner.nextLine();
        Worker worker2 = new Worker(name, ssn, wage,hours);

        // the third user's information too from the user
        System.out.println("enter name: ");
        String name1 = scanner.nextLine();
        System.out.println("enter ssn: ");
        int ssn1 = scanner.nextInt();
        System.out.println("enter wage: ");
        float wage1 = scanner.nextFloat();
        System.out.println("enter hours: ");
        int hours1 = scanner.nextInt();
        Worker worker3 = new Worker(name1, ssn1,wage1,hours1);

        scanner.close();

        worker1.displayInfo();
        worker1.displaySalary();
        worker2.displayInfo();
        worker2.displaySalary();
        worker3.displayInfo();
        worker3.displaySalary();
    }
}