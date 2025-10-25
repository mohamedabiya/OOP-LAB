import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean valid = false;
        while (!valid){
            System.out.println("please enter a integer");
            try {
                number = scanner.nextInt();
                valid = true;
            }catch (InputMismatchException e){
                System.out.println("invalid input! please enter a integer");
                scanner.nextLine();
            }
        }
        return number;
    }
}