import java.util.Scanner;

class Employee
{
    int empId;
    String empName;
    double salary;

    // Constructor
    Employee(int empId, String empName, double salary)
    {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    // Method to display employee details
    void displayEmployee()
    {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input for first employee
        System.out.println("Enter details of Employee 1:");

        System.out.print("Employee ID: ");
        int id1 = sc.nextInt();

        System.out.print("Employee Name: ");
        String name1 = sc.next();

        System.out.print("Salary: ");
        double salary1 = sc.nextDouble();

        Employee emp1 = new Employee(id1, name1, salary1);

        // Input for second employee
        System.out.println("\nEnter details of Employee 2:");

        System.out.print("Employee ID: ");
        int id2 = sc.nextInt();

        System.out.print("Employee Name: ");
        String name2 = sc.next();

        System.out.print("Salary: ");
        double salary2 = sc.nextDouble();

        Employee emp2 = new Employee(id2, name2, salary2);

        // Display details
        System.out.println("\n--- Employee 1 ---");
        emp1.displayEmployee();

        System.out.println("\n--- Employee 2 ---");
        emp2.displayEmployee();

        sc.close();
    }
}
