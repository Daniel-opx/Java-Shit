import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex5 {
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
        if(!(a + b > c) && (a + c > b) && (b + c > a))
        {
            System.out.println("we cannot make a triangle from these edges");
            return;
        }
        String TriangleType = "";
        if (a==b && b ==c)
            TriangleType = "equilateral triangle";
        else if(a==b || b ==c || a == c)
            TriangleType = "isosceles triangle";
        else
            TriangleType = "Scalene triangle";
        System.out.printf("%s", TriangleType);
        reader.close();

    }

}