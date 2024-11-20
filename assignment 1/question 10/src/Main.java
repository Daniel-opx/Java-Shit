import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int lowerBound, upperBound;
        int numberOfTries = 2;
        System.out.println("enter lower bound");
        lowerBound = reader.nextInt();
        System.out.println("enter upper bound");
        upperBound = reader.nextInt();
        while(!IsValid(lowerBound,upperBound))
        {
            if(numberOfTries == 0)
            {
                System.out.println("Error: invalid input, Exiting program");
                return;
            }

            System.out.println("Error: invalid input, please try again");
            System.out.println("enter lower bound");
            lowerBound = reader.nextInt();
            System.out.println("enter upper bound");
            upperBound = reader.nextInt();

            numberOfTries--;
        }
        for(int i = lowerBound; i <= upperBound; i++)
        {
            if(IsPrime(i))
                System.out.print(i +",");
        }




        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
    public static boolean IsValid(int lower, int upper)
    {
        return ((lower > 0 && upper > 0) && (upper >= lower));
    }
    public static boolean IsPrime(int num)
    {
        if (num == 1)
            return false;
        if(num == 2)
            return true;
        for(int i = 2; i < num; i++)
        {
            if(num % i ==0)
                return false;
        }
        return true;
    }
}