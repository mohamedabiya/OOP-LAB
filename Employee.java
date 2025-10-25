public class Employee {
    private int id;
    private String name;
    public static String compname = "MY COMP";

    static int counter;
    public Employee(int id, String name){
        this.id = id;
        this.name = name;
        counter++;
    }
    public void getInfo(){
        System.out.println(this.id+" "+this.name+" "+Employee.compname);
        System.out.println(counter);
    }
}