import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int lowerBound, upperBound;
        int numberOfTries = 2;
        System.out.print("enter lower bound: ");
        lowerBound = reader.nextInt();
        System.out.print("enter upper bound: ");
        upperBound = reader.nextInt();


        while(!((lowerBound > 0 && upperBound > 0) && (upperBound >= lowerBound)))
        {
            if(numberOfTries == 0)
            {
                System.out.println("Error: invalid input, Exiting program");
                return;
            }

            System.out.println("Error: invalid input, please try again");
            System.out.print("enter lower bound: ");
            lowerBound = reader.nextInt();
            System.out.print("enter upper bound: ");
            upperBound = reader.nextInt();

            numberOfTries--;
        }

        boolean didFindPrime = false;
        for(int i = lowerBound; i <= upperBound; i++)
        {
            boolean isPrime = false;
            if(i < 2)
                continue;
            else if (i % 2 == 0) {
                continue;
            }
            else if(i <= 3) {
                isPrime = true;
            }
            else {
                boolean foundContradiction = false;
                for(int j = 3; j < i; j+=2)
                {
                    if(i % j == 0)
                    {
                        foundContradiction = true;
                        break;
                    }
                }
                isPrime = !foundContradiction;
            }

            if(isPrime)
            {
                System.out.println(i);
                didFindPrime = true;
            }
        }
        if(!didFindPrime)
        {
            System.out.println("No prime number in this range");
        }

    }

}