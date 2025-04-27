import java.io.Serializable;
import java.util.Scanner;

// Employee class should be Serializable for object transfer
public class Employee implements Serializable {
    private int empno;
    private String name;
    private double basic;
    private double commission;

    // Accept employee details from keyboard
    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Number: ");
        empno = sc.nextInt();
        sc.nextLine(); // consume the leftover newline
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();
    }

    // Calculate 5% commission
    public void calculate() {
        commission = 0.05 * basic;
    }

    // Display all employee details
    public void display() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee Number : " + empno);
        System.out.println("Employee Name   : " + name);
        System.out.println("Basic Salary    : " + basic);
        System.out.println("Commission (5%) : " + commission);
    }
}
