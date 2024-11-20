import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner reader = new Scanner(System.in);
        double a,b,c;
        System.out.println("enter length of three edges");
        a = reader.nextDouble();
        b= reader.nextDouble();
        c= reader.nextDouble();
        if(a <= 0 || b <= 0 || c <= 0)
        {
            System.out.println("Error");
            return;
        }
        if(!IsValidTriangle(a, b, c))
        {
            System.out.println("we cannot make a triangle from these edges");
            return;
        }
        System.out.printf("%s", GetTriangleType(a, b, c));


    }
    public static boolean IsValidTriangle(double a, double b, double c)
    {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
    public static String GetTriangleType(double a, double b, double c)
    {
        String type = "";
        if (a==b && b ==c)
            type = "equilateral triangle";
        else if(a==b || b ==c || a == c)
            type = "isosceles triangle";
        else
            type = "Scalene triangle";
        return type;
    }
}