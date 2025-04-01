public class Main {
    public static void main(String[] args) {

        // Arrays allow us to store variables of the same type together.

        int[] numbers = new int[5]; // numbers array consist of 5 elements
        // If more elements are defined than the specified number, an error will occur: ArrayIndexOutOfBoundsException.
        numbers[0] = 20; // to reach first elemant of the array
        numbers[1] = 40;
        numbers[2] = 60;
        numbers[3] = 80;
        numbers[4] = 90;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int[] numbers1 = {20, 40, 60, 70, 80}; // another way to define an array
        System.out.println(numbers1[4]);

        String[] names = new String[5];
        names[4] = "ali";

        String[] names1 = {"ali", "veli", "ahmet", "ayse"};

        for(int i = 0; i < 4; i++){
            System.out.println(names1[i]);
        }

        for (String name:names1){
            // Each element of the `names1` array is used with the `name` variable inside the loop.
            System.out.println(name);
        }

        // Multidimensional arrays

        String[][] cities = new String[3][3]; // A 3-row, 3-column matrix is defined.
        // The number of dimensions can be increased by adding more square brackets.

        cities[0][0] = "istanbul";
        cities[0][1] = "bursa";
        cities[0][2] = "bilecik";
        cities[1][0] = "ankara";
        cities[1][1] = "konya";
        cities[1][2] = "kayseri";
        cities[2][0] = "diyarbakır";
        cities[2][1] = "sanlıurfa";
        cities[2][2] = "gaziantep";

        for (int i = 0; i <= 2; i++) {
            System.out.println("------------------------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(cities[i][j]);
            }
        }

    }
}