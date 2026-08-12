class Car
{
    private String model;

    // Constructor
    public Car(String model)
    {
        this.model = model;
    }

    // Public method to access private variable
    public void showModel()
    {
        System.out.println("Model: " + model);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Car c = new Car("BMW");

        // Direct access is NOT allowed
        // System.out.println(c.model);  // ERROR

        // Correct way to access the private variable
        c.showModel();
    }
}
