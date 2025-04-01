public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[]{1,2,5,7,9,0} ;
        int wanted = 5;
        boolean isThere =false;

        for (int number :numbers){

            if (number ==wanted){

                isThere = true;
                break;
            }
        }

        if(isThere){
            System.out.println("The number exists.");
        } else{
            System.out.println("The number does not exist.");
        }
    }

}