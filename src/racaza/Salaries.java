package requirosoc;

import java.util.Scanner;

public class EmployeeManager {
    
    public void Salaries() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of Employees: ");
        int emp = input.nextInt();

        Salary[] salaries = new Salary[emp];

        for (int i = 0; i < emp; i++) {
            System.out.println("Details of Employee " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = input.nextInt();  

            System.out.print("Name: ");
            String name = input.next();  

            System.out.print("Rate: ");
            double rate = input.nextDouble();

            System.out.print("Hours Worked: ");
            double hrs = input.nextDouble();

            System.out.print("Total Deduction: ");
            double deduc = input.nextDouble();

            salaries[i] = new Salary(id, name, rate, hrs, deduc);
        }

        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
                "ID", "Name", "Rate", "Hours", "Gross", "Deduction", "Net Pay");

        for (Salary s : salaries) {
            System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f\n", 
                    s.id, s.name, s.rate, s.hoursWorked, s.grossPay, s.deduction, s.netPay);
        }
    }
}