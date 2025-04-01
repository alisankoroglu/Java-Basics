public class Main {
    public static void main(String[] args) {
        // Let's try to determine whether the given number is a prime number or not.

        int number = -1; // The number being checked for primality

        // Usage of the remainder operator (%)
        int remainder = number % 2; //  The remainder of the number divided by 2 is assigned to the variable `reminder`.
        System.out.println(remainder);


        boolean isPrime = true; // A boolean variable that holds the primality value

        if (number<1){ // Numbers less than 1 are not considered prime.
            System.out.println("Invalid number");
            return; // The `return` statement ends the execution of the current function.
        } // Here, if the condition is met and the `return` statement is executed,
        // the current function—in this case, the `main` function—will be terminated.

        if (number ==1){ // 1 is not a prime number. The smallest prime number is 2.
            System.out.println("The number is not prime.");
            return;
        }

        for(int i = 2; i<number; i++){
            if (number% i == 0){ // If the number gives a remainder of 0 when divided by any number smaller than itself, then it is not prime.
                isPrime = false;
            }
        }

        if (isPrime){
            System.out.println("The number is prime.");
        }else{
            System.out.println("The number is not prime.");
        }
    }
}