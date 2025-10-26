class Worker {
    String name;
    int socialSecurityNumber;
    float wage;
    int workingHours;

    public Worker(String name, int ssn, float wage, int hours){
        this.name = name;
        this.socialSecurityNumber = ssn;
        this.wage = wage;
        this.workingHours = hours;
    }

    public void displayInfo(){
        System.out.println("name: " + name + ", SSN: " + socialSecurityNumber);
    }
    public void displaySalary(){
        float salary = wage * workingHours;
        System.out.println("salary = "+salary);
    }
}