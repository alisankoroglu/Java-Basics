public class Main {
    public static void main(String[] args) {
        // A number whose sum of all its positive divisors, excluding itself,
        // is equal to the number is called a perfect number. For example,
        // the number 6 is a perfect number because it is divisible by 1, 2, and 3, and their sum is 6.

        int number = 28;
        int total = 0 ;

        for (int i = 1; i<number; i++){
            if (number%i == 0){
                total = total + i;
            }
        }
        if (total == number){
            System.out.println("It is a perfect number.");
        }else {
            System.out.println("It is not a perfect number.");
        }
    }



}