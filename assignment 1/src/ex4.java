import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex4 {
    public static void main(String[] args) {
        String dayACE = "9:00-14:00";
        String dayB = "9:00-13:00";
        String dayD = "9:00-13:00, 16:00-19:00";
        String dayF = "08:00- 12:00";
        String dayG = "closed";

        boolean isValidInput = true;
        Scanner scanner = new Scanner(System.in);
        char day = 10;
        do{
            isValidInput = true;
            System.out.print("Enter the day of the week (A-G): ");
             day = scanner.findInLine(".").charAt(0);

             isValidInput = scanner.nextLine() == "";
             if(!isValidInput)
                 day = 1;

            if (day >= 'a' && day <= 'z')
            {
                day = (char)(day - 32);
            }

            switch (day)
            {
                case 'A', 'C', 'E':
                    System.out.println("call center hours:" + dayACE);
                    break;
                case 'B':
                    System.out.println("call center hours:" + dayB);
                    break;
                case 'D':
                    System.out.println("call center hours:" + dayD);
                    break;
                case 'F':
                    System.out.println("call center hours:" + dayF);
                    break;
                case 'G':
                    System.out.println("call center hours:" + dayG);
                    break;
                default:
                    System.out.println("error - invalid input.");
                    //clearing the System.in buffer from any remaining letters
            }

        }while (day < 'A' || day > 'G');
        scanner.close();

    }
}