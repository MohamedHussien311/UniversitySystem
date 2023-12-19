public abstract class Employee extends Person{
    protected double salary;
    //Constructor
    public Employee(String name, int age, String address, int phoneNumber, int SSN, int id,double salary) {
        super(name, age, address, phoneNumber, SSN,id);
        this.salary = salary;
    }
    public  void setSalary (double salary){
        this.salary = salary;
    }
    // abstract getSalary which should be implemented in the derived class
    public abstract double getSalary ();
}
