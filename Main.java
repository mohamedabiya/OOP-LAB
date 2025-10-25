public class Main {
    public static void main(String[] args){
        Account acc = new Account("ahmed",1000.00);
        acc.addMoney(300);
        acc.withdraw(1400);
        System.out.println(acc.getName()+" "+acc.getBalance()+"$");
    }
}