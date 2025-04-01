import java.util.Scanner; // The library required to get input from the user

public class Main {
    public static void main(String[] args) {

        int number1 = 20;
        int number2 = 30;

        // if type1
        if (number1 < number2) {
            System.out.println("number1 is smaller");
        }
        System.out.println("the Progress Continue");

        // if type2
        if (number1 == number2) {
            System.out.println("numbers are equal");
        } else {
            System.out.println("numbers are not equal");
        }
        System.out.println("the Progress Continue");

        // if type3
        if (number1 < number2) {
            System.out.println("number1 is smaller");
        } else if (number1 > number2) {
            System.out.println("number2 is smaller");
        } else {
            System.out.println("numbers are equal");
        }
        System.out.println("the Progress Continue");

        // Switch-Case Structure
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number3 = input.nextInt();

        System.out.println("Enter second number: ");
        int number4 = input.nextInt();

        System.out.println("Choose the operator(1:+, 2:-, 3:*, 4:/): ");
        byte operator = input.nextByte();

        switch (operator) {
            case 1:
                System.out.println(number3 + number4);
                break;
            case 2:
                System.out.println(number3 - number4);
                break;
            case 3:
                System.out.println(number3 * number4);
                break;
            case 4:
                System.out.println(number3 / number4);
                break;
            default:
                System.out.println("Wrong number");
                break;

        }

        // If you press **Ctrl + Shift + Alt + L** and click **Run** in the window that opens, it will format your code in terms of style.


    }
}