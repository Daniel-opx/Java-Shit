import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex3 {
    public static void main(String[] args) {
        int a,b;
        Scanner s = new Scanner(System.in);
        System.out.println("please enter integer");
        a = s.nextInt();
        System.out.println("enter the second integer");
        b = s.nextInt();
        while (a == b)
        {
            System.out.println("the second and first number is equal, please enter new number for the second number");
            b = s.nextInt();
        }

        int sumOfDigitA = 0;
        //because we dont use function we need to create another variable- a function would have take the int by value
        //i.e copy of the variable value and not the variable itself
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


    }

}