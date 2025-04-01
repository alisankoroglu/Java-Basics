import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // for Loop: The `for` loop is used to perform a specific number of operations.
        for(int i = 0; i<10; i++){
            System.out.println(i);
        }
        System.out.println("End of for loop");

        // Print the even numbers between 0 and 10.
        for(int i = 0; i<10; i++){
            if(i%2 == 0){ // Is the remainder of the division by 2 equal to 0?
                System.out.println(i);
            }
        }

        // while loop: The `while` loop executes the commands inside the loop as long as the condition is true.
        int numerator = 1;
        while(numerator<=10){
            System.out.println(numerator);
            numerator++; // An update must be made inside the loop to prevent it from running into an infinite loop.
        }
        System.out.println("End of while loop");

        // while True: In a `while true` loop, a condition and the `break` statement should be used
        // to exit the loop when the desired condition is met.
        Scanner input = new Scanner(System.in);
        int number;
        while(true){
            System.out.println("Enter a number: ");
            number = input.nextInt();
            if(number == 0){
                break; // to break endless loop
            }
        }
        System.out.println("loop ended, progress continue");

        // Do-while Loop: The `do_while` loop executes the commands inside the loop at least once,
        // even if the condition is not met, because the condition is checked at the end of the loop.
        int number1;
        do{
            System.out.println("Enter a number: ");
            number1 = input.nextInt();
        }while(number1 == 0);
        System.out.println("End of do-while loop");

    }
}