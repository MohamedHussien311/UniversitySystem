public class AssistantProfessor extends Professor{
    private int numberOfOvertimeHours;
    private double hourPrice;
    private double deduction;  // خصم
    //Constructor
    public AssistantProfessor(String name, int age, String address, int phoneNumber, int SSN,int id, double salary, String department,double bouns, int numberOfOvertimeHours, double hourPrice, double deduction) {
        super(name, age, address, phoneNumber,SSN,id,salary, department,bouns);
        this.numberOfOvertimeHours = numberOfOvertimeHours;
        this.hourPrice = hourPrice;
        this.deduction = deduction;
    }
    public int getNumberOfHours() {
        return numberOfOvertimeHours;
    }
    public void setNumberOfOvertimeHours(int numberOfOvertimeHours) {
        this.numberOfOvertimeHours = numberOfOvertimeHours;
    }
    public double getHourPrice() {
        return hourPrice;
    }
    public void setHourPrice(double hourPrice) {
        this.hourPrice = hourPrice;
    }
    public double getDeduction() {
        return deduction;
    }
    public void setDeduction(int deduction) {
        this.deduction = deduction;
    }
    @Override
    public double getSalary(){
        return salary + (numberOfOvertimeHours*hourPrice) - deduction;
    }
}
