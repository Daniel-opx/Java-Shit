//Asignment : 1
//Author: Daniel Sasson, ID 318885167

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex11 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int num;
        int tries = 2;

        System.out.print("please enter number grater than 1: ");
        num = reader.nextInt();

        while (num < 1) {
            if (tries == 0) {
                System.out.println("Error: the number must be greater than 1, Exiting Program");
                return;
            }
            System.out.println("Error: the number must be greater than 1, please try again");
            System.out.println("please eneter number grater than 1");
            num = reader.nextInt();
            tries--;
        }


        int divisor = 1;
        while (true)
        {
            boolean isPrime = true;
            for(int i = 2; i < num; i++)
            {
                if(num % i == 0)
                {
                    isPrime = false;
                    divisor = i;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println(num);
                break;
            }
            num /= divisor;
            System.out.println(divisor);
        }

    }


}