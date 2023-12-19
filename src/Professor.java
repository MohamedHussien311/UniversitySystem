public class Professor extends Employee{
    private String department;
    private double bonus;
    //Constructor
    public Professor(String name, int age, String address, int phoneNumber, int SSN, int id,double salary, String department,double bonus) {
        super(name, age, address, phoneNumber, SSN,id, salary);
        this.department = department;
        this.bonus = bonus;
    }
    // Getters and Setters
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }
    @Override
    public double getSalary(){
        return salary+bonus;
    }
}
