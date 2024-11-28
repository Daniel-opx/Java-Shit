import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex3 {
    public static void main(String[] args) {
        int a= 0,b = 0;
        Scanner s = new Scanner(System.in);

        boolean isFirstTime = true;
        do{
            if(!isFirstTime)
                System.out.println("The numbers must be different. please try again");
            System.out.print("Enter the first integer: ");
            a = s.nextInt();
            System.out.print("Enter the second integer: ");
            b = s.nextInt();
            if(isFirstTime)
            {
                isFirstTime = false;
            }
        }while (a == b);




        int sumOfDigitA = 0;
        int copyOfA = a;
        //absolute value of the number
        copyOfA = a< 0? a *-1: a;

        while (copyOfA > 0)
        {
            sumOfDigitA += copyOfA%10;
            copyOfA /= 10;
        }

        int sumOfDigitB = 0;
        int copyOfB = b;
        //absolute value of the number
        copyOfB = b< 0? b * -1: b;
        while (copyOfB > 0)
        {
            sumOfDigitB += copyOfB % 10;
            copyOfB /= 10;
        }

        if (sumOfDigitA == sumOfDigitB)
        {
            System.out.printf("the numbers %d and %d have the same sum of digits",a,b);
        }
        else
        {
            System.out.printf("the numbers %d and %d do not have the same sum of digits",a,b);
        }
        s.close();
    }
}