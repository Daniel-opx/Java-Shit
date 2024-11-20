import java.util.Scanner;
//Asignment : 1
//Author: Daniel Sasson, ID 318885167

public class ex1 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter num");
        float a = scanner.nextFloat();
        System.out.println("please enter num");
        float b = scanner.nextFloat();
        System.out.println("please enter num");
        float c = scanner.nextFloat();
        System.out.println("please enter num");
        float d = scanner.nextFloat();
        System.out.printf("%.2f %.2f %.4f %.2f\nthr sum of the numbers is %f\n", a,b,c,d, a+b+c+d);
        System.out.printf("the sum of the rounded numbers is %f",
                (RoundNum(a) + RoundNum(b) + RoundNum(c) + RoundNum(d))
        );
        System.out.printf("the avg is: %f\n", (a+b+c+d)/4.0);
        System.out.printf("the sum of whole parts is: %f\n",
                (getWholePart(a)+getWholePart(b)+getWholePart(c)+getWholePart(d)));



    }
    public static float RoundNum(float f)
    {
       float fraction  = f - (int)f;
       if (f > 0)
       {
           if (fraction != 0)
           {
               return f + (1-fraction);
           }
           else
               return f;
       }
       if (f < 0)
       {
           if (fraction != 0)
           {
               return (f -fraction);
           }
           else
               return f;
       }
       return 0.0f;

    }
    public static float getWholePart(float f)
    {
        return (int)f;
    }
}