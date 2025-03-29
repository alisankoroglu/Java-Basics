import java.util.Scanner; //

public class Main {

    public static void main(String[] args) {

        // Java is a case-sensitive language, meaning it distinguishes between uppercase and lowercase letters.

        /*
        When defining a variable name in Java, camel casing is used.
        If the name consists of two or more words, the first word is written entirely in lowercase,
        and the first letter of each subsequent word is capitalized — with all words written together without spaces.
        Such as customerName or numberOfStudents
         */

        /*
        Reusability: Reusability means writing code in a way that it can be used again in different
        parts of a program — or even in different projects — without rewriting it from scratch.

        Code Refactoring:Refactoring is the process of restructuring existing code without changing
        its behavior — to make it cleaner, more efficient, and easier to maintain.
         */

        int number1 = 12;
        float number2 = 12;

        String text = "Hello Word!";

        System.out.println(number1);
        System.out.println("number1");

        System.out.println(number2);

        System.out.println(text);

        // Data types for İnteger values

        // The byte data type can take values between -129 and 127. It reserves 1 byte of space in memory.
        byte number3 = 127;
        System.out.println(number3);

        // It is 16 bits long. Max is 32,767, Min is -32,768.
        short number4 = 32767;
        System.out.println(number4);

        // It is 32 bits long. Max is 2,147,483,647, Min is -2,147,483,648.
        int number5 = 214748364;
        System.out.println(number5);

        // It is 64 bits long. Max is 9,223,372,036,854,775,807, Min is -9,223,372,036,854,775,808.
        long number6 = 123122313;
        System.out.println(number6);

        // Data Types for decimal values

        // It is 32 bits in size and can be defined as a value between 1.4×10^-45 and 3.4×10^38.
        float number7 = 17.2F;
        System.out.println(number7);

        // It is 64 bits in size and can be defined as a value between 4.9×10^-324 and 1.8×10^308.
        double number8 = 17.2F;
        System.out.println(number8);

        // Character Data Types

        // Characters are stored with Char.
        // Compared to other languages, Char is 16 bits in Java.
        // Java uses the Unicode character set and includes all languages.
        // Since Java is designed as a universal language, the character set is also defined with the universal set, Unicode.
        char character = '@';
        System.out.println(character);

        // The String class is a class found in the java.lang libraries that performs all kinds of operations related to text.
        // String is used instead of char in textual expressions and operations.
        String text1 = "Hello";
        System.out.println(text1);

        // Java has a type called boolean to store logical values.
        // Boolean can only take two values: True and False
        // Usually used for control purposes in conditional and loop operations.
        boolean isTrue = false;
        System.out.println(isTrue);

        Scanner input = new Scanner(System.in); // To capture keyboard input
        System.out.print("Please enter a number: ");

        int number9 = input.nextInt(); // It reads as an integer
        System.out.println(number9);

        System.out.print("Please enter a number: ");

        int number10 = input.nextInt();
        System.out.println(number10);

        int toplam = number9 + number10;

        System.out.println(toplam);

        System.out.println("Total value: " + (number9 + number10)); //It first evaluates the variables by performing addition, and then concatenates the result as a string.
        System.out.println("Total value: " + number9 + number10); // It concatenates the values as strings
        System.out.println(number9 + " " + number10);
    }
}