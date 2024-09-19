package requirosoc;

public class Salary {
    public int id;
    public String name;
    public double rate;
    public double hoursWorked;
    public double grossPay;
    public double deduction;
    public double netPay;

    public Salary(int id, String name, double rate, double hoursWorked, double deduction) {
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.hoursWorked = hoursWorked;
        this.grossPay = rate * hoursWorked;
        this.deduction = deduction;
        this.netPay = grossPay - deduction;
    }
}