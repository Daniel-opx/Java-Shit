import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        int binaryNum;
        int mult = 1;
        System.out.println("enetr a number in binary representation: ");
        binaryNum = scanner.nextInt();
        int decimal=0;

        while(binaryNum > 0)
        {
            decimal += (int)((binaryNum % 10) * mult);
            binaryNum /= 10;
            mult *= 2;
        }
        System.out.println(binaryNum+ "(in base 2) =" + decimal + "(in base 10)");
    }
}