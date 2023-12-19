public class Security extends Employee{
    private String shift;
    private boolean isArmed;
    private double deduction;
    //Constructor
    public Security(String name, int age, String address, int phoneNumber, int SSN,int id, double salary, String shift, boolean isArmed) {
        super(name, age, address, phoneNumber, SSN,id, salary);
        this.shift = shift;
        this.isArmed = isArmed;
    }
    // Setters and Getters
    public void setShift(String shift) {
        this.shift = shift;
    }
    public String getShift() {
        return shift;
    }
    public void setArmed(boolean isArmed) {
        this.isArmed = isArmed;
    }
    public boolean isArmed() {
        return isArmed;
    }
    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }
    public double getDeduction() {
        return deduction;
    }
    @Override
    public double getSalary(){
        return salary-deduction;
    }
}
