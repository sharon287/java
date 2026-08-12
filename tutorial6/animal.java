package Module1;

class Animal
{
    String species;   // Default access

    Animal(String species)
    {
        this.species = species;
    }

    void displaySpecies()
    {
        System.out.println("Species: " + species);
    }
}

class Employee
{
    protected int salary;

    Employee(int salary)
    {
        this.salary = salary;
    }

    protected void showSalary()
    {
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee
{
    Manager(int salary)
    {
        super(salary);
    }

    void display()
    {
        System.out.println("Manager Salary: " + salary);
        showSalary();
    }
}

public class Main
{
    public static void main(String[] args)
    {
        // Default Access Modifier
        System.out.println("===== DEFAULT ACCESS =====");

        Animal a = new Animal("Dog");

        System.out.println("Direct Access: " + a.species);
        a.displaySpecies();

        // Protected Access Modifier
        System.out.println("\n===== PROTECTED ACCESS =====");

        Manager m = new Manager(50000);

        m.display();
    }
}
