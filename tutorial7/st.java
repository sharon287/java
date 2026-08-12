package mod1;
import java.util.Scanner;


class Students
{
    String name;
    int rollNo;
    String course;

    void setDetails(String name, int rollNo, String course)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

class StudentAccount extends Students
{
    double collegeFee;

    void setCollegeFee(double collegeFee)
    {
        this.collegeFee = collegeFee;
    }

    void displayCollegeFee()
    {
        System.out.println("College Fee: " + collegeFee);
    }
}

class Hosteller extends StudentAccount
{
    double hostelFee;
    double messFee;

    void setHostelDetails(double hostelFee, double messFee)
    {
        this.hostelFee = hostelFee;
        this.messFee = messFee;
    }

    void displayHosteller()
    {
        System.out.println("\n--- Hosteller Details ---");
        displayDetails();
        displayCollegeFee();
        System.out.println("Hostel Fee: " + hostelFee);
        System.out.println("Mess Fee: " + messFee);

        double totalFee = collegeFee + hostelFee + messFee;
        System.out.println("Total Fee: " + totalFee);
    }
}

class DayScholar extends StudentAccount
{
    double busFee;

    void setBusFee(double busFee)
    {
        this.busFee = busFee;
    }

    void displayDayScholar()
    {
        System.out.println("\n--- Day Scholar Details ---");
        displayDetails();
        displayCollegeFee();
        System.out.println("Bus Fee: " + busFee);

        double totalFee = collegeFee + busFee;
        System.out.println("Total Fee: " + totalFee);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Hosteller input
        System.out.print("Enter Hosteller's Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter College Fee: ");
        double collegeFee = sc.nextDouble();

        System.out.print("Enter Hostel Fee: ");
        double hostelFee = sc.nextDouble();

        System.out.print("Enter Mess Fee: ");
        double messFee = sc.nextDouble();

        Hosteller hosteller = new Hosteller();

        hosteller.setDetails(name, rollNo, course);
        hosteller.setCollegeFee(collegeFee);
        hosteller.setHostelDetails(hostelFee, messFee);

        sc.nextLine();

        // Day Scholar input
        System.out.print("Enter Day Scholar's Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        course = sc.nextLine();

        System.out.print("Enter College Fee: ");
        collegeFee = sc.nextDouble();

        System.out.print("Enter Bus Fee: ");
        double busFee = sc.nextDouble();

        DayScholar dayScholar = new DayScholar();

        dayScholar.setDetails(name, rollNo, course);
        dayScholar.setCollegeFee(collegeFee);
        dayScholar.setBusFee(busFee);

        // Display details
        System.out.println("\n=========");
        System.out.println("      STUDENT DETAILS");
        System.out.println("============");

        hosteller.displayHosteller();
        dayScholar.displayDayScholar();

        sc.close();
    }
}
