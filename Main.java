public class Main {
    public static void main(String[] args){
        System.out.println("welcome to java");
//        Student s1 = new Student(5,"ahmed");
        Student s1 = new Student();
        s1.number =5;
        s1.name = "ahmet";
        s1 = null;    // hata veriyor
        s1.printName();
    }
}