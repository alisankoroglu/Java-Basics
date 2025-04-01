public class Main {
    public static void main(String[] args) {
        findNumber();
    }

    /*
    Method names are written in camelCase, such as `findNumber`.
    When writing a program, it's important to avoid repeating code as much as possible.
    That's why frequently used code blocks should be written as methods.
    Here, we reused the code we wrote in the previous lesson by splitting it
    into two different methods.
    */

    public static void findNumber(){

        int[] numbers = new int[]{1,2,5,7,9,0} ;
        int wanted = 5;
        boolean isThere =false;

        for (int number :numbers){
            if (number == wanted){
                isThere = true;
                break;
            }
        }
        if(isThere){
            giveMessage("The number exists:" + wanted);
        } else{
            giveMessage("The number does not exist:" + wanted);
        }

    }

    public static void giveMessage(String message){
        System.out.println(message);
    }

}

