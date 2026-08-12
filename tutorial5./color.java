package mod2;
import java.util.Vector;

public class Main
{
    public static void main(String[] args)
    {
        Vector<String> colors = new Vector<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        colors.remove("Green");

        System.out.println("Final Vector:");

        for(String color : colors)
        {
            System.out.println(color);
        }
    }
}
