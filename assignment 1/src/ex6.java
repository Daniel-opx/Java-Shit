//Asignment : 1
//Author: Daniel Sasson, ID 318885167

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        int binaryNum;
        int mult = 1;
        System.out.print("enter a number in binary representation: ");
        binaryNum = scanner.nextInt();
        int decimal=0;

        int binaryNumCopy = binaryNum;
        while(binaryNumCopy > 0)
        {
            decimal += (int)((binaryNumCopy % 10) * mult);
            binaryNumCopy /= 10;
            //the weight of the number in base 2
            mult *= 2;
        }
        System.out.println(binaryNum+ "(in base 2) =" + decimal + "(in base 10)");
    }
}