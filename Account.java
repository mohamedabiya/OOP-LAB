import java.util.Scanner;

public class Account {
    private Double balance;
    private String name;
    private final String pass = "1234";

    public Account(String name, Double balance) {
        this.name = name;
        this.balance = balance;
    }
    // musterinin adini ayarlayan metod
    public void setName(String name) {
        this.name = name;
    }
    // musterinin adini donduren metod
    public String getName() {
        return name;
    }
    //hesaba para ekleyen metod
    public void addMoney(double amount) {
        if (amount>0)
            balance += amount;
    }
    // hesaptan para ceken metod
    public void withdraw(double amount){
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (attempts < 3){
            System.out.println("please enter the password ");
            String input = scanner.nextLine();

            if (input.equals(pass)){
                if (amount>0 && amount<=balance){
                    balance -= amount;
                    System.out.println("Withdrawal successful. New balance: " + balance);
                }else {
                    System.out.println("Invalid amount or insufficient funds.");
                }
                break;
            }
            else{
                System.out.println("incorect password");
                attempts++;
            }
        }
        scanner.close();
    }
    // bakiye donduren metod
    public double getBalance(){
        return balance;
    }
}