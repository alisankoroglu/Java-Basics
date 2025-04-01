public class Main {
    public static void main(String[] args) {

        add();
        delete();
        update();

        int number = sum(5,8);
        System.out.println(number);

        int number1 = 5;
        int number2 = 8;
        System.out.println(sum(number1,number2));

        System.out.println(returnCity());

        int total = sum2(2,3,4,5,6,6,7,7); // In the background, it converts these numbers into an array.
        System.out.println(total);
    }

    public static void add(){
        System.out.println("added");
    }
    public static void delete(){
        System.out.println("deleted");
    }
    public static void update(){
        System.out.println("updated");
    }
    // The `void` keyword in the expression `public static void` indicates that the defined function does not return any value.
    // Functions like these perform an operation but do not return any value.

    public static int sum (int number1, int number2){
        return number1 + number2;
    }
    // Here, the `'int` in the expression `public static int` indicates that the function will return a value of type integer.
    // The parameters to be passed to the function are specified within parentheses, with their data types indicated.

    public static String returnCity(){
        return "ankara";
    }

    public static int sum2(int... numbers){

        // If we want to pass multiple arguments with an unknown count to a function, we use `...` (three dots)
        // after specifying the data type, as shown above. Another method is to pass an array to the function.

        int sum = 0;

        for (int number:numbers){
            sum = sum + number;
        }

        return sum;
    }
}