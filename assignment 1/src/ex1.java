//Asignment : 1
//Author: Daniel Sasson, ID 318885167

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        float a = scanner.nextFloat();
        System.out.print("Number: ");
        float b = scanner.nextFloat();
        System.out.print("Number: ");
        float c = scanner.nextFloat();
        System.out.print("Number: ");
        float d = scanner.nextFloat();


        //redundant repetition that can be avoided by putting this logic into function and invoking the function each time its needed
        //in addition it can barely be scaled - in the case of sum of 10 rounded floats the code will be disaster.
        //furthermore instead of utilizing the fact that a function takes primitive types by value we create more
        //variables for this rounding because we use these floats variables later and we cant mutate them
        float fractionA  = a - (int)a;
        float roundedA = a;
        if (a > 0)
        {
            if (fractionA != 0)
            {
                roundedA = a + (1-fractionA);
            }
        }
        if (a < 0)
        {
            if (fractionA != 0)
            {
                roundedA = a-fractionA;
            }
        }


        float fractionB  = b - (int)b;
        float roundedB = b;
        if (b > 0)
        {
            if (fractionB != 0)
            {
                roundedB = b + (1-fractionB);
            }
        }
        if (b < 0)
        {
            if (fractionB != 0)
            {
                roundedB = b-fractionB;
            }
        }

        float fractionC  = c - (int)c;
        float roundedC = c;
        if (c > 0)
        {
            if (fractionC != 0)
            {
                roundedC = c + (1-fractionC);
            }
        }
        if (c < 0)
        {
            if (fractionC != 0)
            {
                roundedC = c-fractionC;
            }
        }

        float fractionD  = d - (int)d;
        float roundedD = d;
        if (d > 0)
        {
            if (fractionD != 0)
            {
                roundedD = d + (1-fractionD);
            }
        }
        if (d < 0)
        {
            if (fractionD != 0)
            {
                roundedD = d-fractionD;
            }
        }
        float sumOfRoundedFloats = roundedA + roundedB + roundedC + roundedD;


        System.out.printf("Numbers entered:[%.2f %.2f %.2f %.2f]\nSum of the numbers: %.2f\n", a,b,c,d, a+b+c+d);
        System.out.printf("the sum of the numbers rounded  up: %.2f\n",
                sumOfRoundedFloats
        );


        System.out.printf("Averge of the numbers: %.2f\n", (a+b+c+d)/4.0);
        System.out.printf("the sum of the integer parts of the number: %d\n",
                (int) a+ (int)b+ (int)(c)+ (int)(d));
        scanner.close();



    }

}