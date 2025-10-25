public class Engineer {
    int id;
    String name;
    static int counter;
    static String companyname = "MY COMP";
    Engineer(int id, String name){
        this.id = id;
        this.name = name;
        counter++;
    }
}