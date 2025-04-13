public class Main {
    public static void main(String[] args) {
        /*
        The primary and most important feature of classes is grouping. We group the tasks to be done using classes.

        To define a new class, right-click on the src folder in the left panel, select New > Java Class,
        and then name it to create a new Java class.
        */

        // Now, let's define an object using the Java class we just created.
        CustomerManager customerManager = new CustomerManager(); // In the CustomerMeneger class, an object named customerMenager was defined.

        // This way, we can access the features that are grouped within the classes.
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        // In Java, classes are reference types. There are two main memory areas in Java: Stack and Heap.

        // Let's break down the statement: CustomerManager customerManager = new CustomerManager();

        // Right side: new CustomerManager()
        // -> This creates a new object in the Heap memory. The object is assigned a reference number (memory address) by the JVM.

        // Left side: CustomerManager customerManager
        // -> This declares a reference variable named customerManager in the Stack memory.
        // -> This variable will hold the reference (address) of the object created in the Heap.

        // Assignment operator (=):
        // -> Connects the reference variable in the Stack to the actual object in the Heap.
        // -> So, customerManager in the Stack now points to the object in the Heap.

        // In summary:
        // - Stack: Stores the reference variable (name + address) pointing to the object.
        // - Heap: Stores the actual object created with the 'new' keyword.
        // - This structure allows Java to access objects efficiently and manage memory effectively.

        CustomerManager customerManager2 = new CustomerManager();
        // This line creates a second, separate object in memory.
        // Now there are two distinct objects in the Heap, each with its own reference in the Stack.

        customerManager = customerManager2;
        // This line assigns the reference of customerManager2 to customerManager.
        // Both variables now point to the same object in the Heap.

        // As a result, the original object that customerManager was pointing to is no longer referenced.
        // Since no variable is holding its reference, it becomes unreachable.

        // Java’s memory manager, called the Garbage Collector,
        // will automatically detect that the object is no longer in use and remove it from memory.


        int number1 = 10;
        int number2 = 20;
        number2 = number1;
        number1 = 30;
        System.out.println(number2);  // Output: 10

        // The result is 10 because int is a primitive (value) type.
        // When you assign number1 to number2, the actual value (10) is copied.
        // Changing number1 afterward does not affect number2, since it already holds its own copy of the value.

        // Types like int, double, byte, etc. are called value types (primitive types).
        // When you use a value type, everything is stored in the Stack.
        // Unlike reference types (like objects), they do not point to memory in the Heap.

        int[] numbers1 = new int[]{1, 2, 3};
        int[] numbers2 = new int[]{4, 5, 6};
        numbers2 = numbers1;
        numbers1[0] = 10;
        System.out.println(numbers2[0]);  // Output: 10

        // The result is 10 because arrays are reference types in Java.
        // When we assign numbers1 to numbers2, both variables now point to the same array in the Heap.
        // This means any change made through one reference (like numbers1[0] = 10)
        // is also visible through the other reference (numbers2).

        // In memory, both variables hold the same reference to a single array object.
        // So, modifying the object through one variable affects the object seen by the other.


    }
}
