import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex8 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        byte num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a positive integer");
        num = scanner.nextByte();

        while(!(num < 10 && num > 0)) {
            System.out.println("Error: the number must be positive , please try again");
            System.out.println("enter a positive integer");
            num = scanner.nextByte();
        }

        int min =1,max = 1;
        for(int i  = 0; i < num; i++)
        {
            min *= 10;
        }
        max = min * 10;

        for(int i = min; i < max; i++)
        {
            int currNum = i;
            int reversed = 0;
            while(currNum > 0)
            {
                reversed = (reversed * 10) + (currNum % 10);
                currNum /= 10;
            }
            if(reversed == i)
                System.out.println(i);
        }

    }


}