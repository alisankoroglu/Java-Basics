public class Main {
    public static void main(String[] args) {

        // Numbers whose sums of proper positive divisors (excluding the numbers themselves) are equal to each other are called amicable numbers.
        // The smallest known amicable numbers are 220 and 284.
        // The sum of the proper positive divisors of 220 is 284, while the sum of the proper positive divisors of 284 is 220.

        int number1 = 220 ;
        int number2 = 284 ;
        int sum1 = 0 ;
        int sum2 = 0 ;

        for (int i = 1; i<number1; i++){
            if (number1%i == 0){
                sum1 = sum1 + i ;
            }
        }

        for (int i = 1; i<number2; i++){
            if (number2%i == 0){
                sum2 = sum2 + i ;
            }
        }

        if (number1==sum2){
            if (number2 == sum1){
                System.out.println("The numbers are amicable.");
            }
        }

// The structure above is a cleaner version of the if statement. The `&&` symbol represents the logical AND operator.
// The result will be true only if both sides of the expression are true.
        if (number1==sum2 && number2==sum1){
            System.out.println("The numbers are amicable.");
        }

// The `||` symbol represents the logical OR operator.
// The result will be true if at least one of the expressions is true.
    }
}