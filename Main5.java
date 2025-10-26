import java.util.Scanner;

public class Main5 {
    public static void main(){
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        double amount;

        while (true){
            try {
                System.out.println("enter the amount");
                amount = scanner.nextDouble();
                if (amount<=0){
                    throw new IllegalArgumentException("amount must be greater than zero");
                }
                break;
            } catch (Exception e) {
                System.out.println("invalid input"+e.getMessage());
                scanner.nextLine();
            }
        }
        try {
            if (amount<=0){
                throw new IllegalArgumentException("the amount bust be greater than zero");
            }
            boolean validChoise = false;
            while (!validChoise){
                System.out.println("for: usd to tl press 1");
                System.out.println("for: euro to tl press 2");
                int choise = scanner.nextInt();
                if (choise == 1) {
                    result = CurrencyConverter.conver_ust_to_tl(amount);
                    System.out.println(amount+" USD = "+result+" TL");
                    validChoise = true;
                }
                else if (choise == 2) {
                    result = CurrencyConverter.convert_eur_to_tl(amount);
                    System.out.println(amount+" EUR = "+result+" TL");
                    validChoise = true;
                }
                else
                    System.out.println("please press 1 or 2");
            }
        } catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        scanner.close();
        System.out.println();
        System.out.println();

        Teacher teacher1 = new Teacher(2501,Branch.MATH);
        Teacher teacher2 = new Teacher(2502,Branch.PHYSICS);
        Teacher teacher3 = new Teacher(2503,Branch.CS);
        Teacher teacher4 = new Teacher(2504,Branch.ENG);

        Teacher[] teachers = {teacher1,teacher2,teacher3,teacher4};
        for (Teacher t :teachers)
            System.out.println("Branch: "+t.branch +", description: "+t.branch.getDescription());

        System.out.println();
        System.out.println();

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(15);

        Circle[] circles = {circle1,circle2,circle3};
        for (Circle circle : circles)
            System.out.println("Area: "+circle.computeArea());
    }
}