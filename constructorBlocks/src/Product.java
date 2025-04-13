public class Product {

    // Every class has a default constructor with the same name as the class, even if it is not explicitly defined.
    // If needed, we can create our own constructor to customize the initialization process.


    public Product() {
        // This is the default constructor.
        // Even if we don't write it explicitly, it is still available by default.
        // When we define it ourselves like this, we can create objects without passing parameters.
        // Then we can set values using setter methods. This practice is known as "overloading".
    }

    // These two constructors can exist together in the same class.
    // This way, we can either pass values using parameters or use getter and setter methods.

    public Product(int id, String name, String description) {
        // When we create a new object in another class, such as:
        // Product product = new Product(1, "Laptop", "Gaming laptop");
        // this constructor is called.
        // You can think of it as a special method that runs when an object is created.

        System.out.println("Constructor block executed.");

        // We can also pass parameters to the constructor and use them inside the class.
        // When using this constructor, we are required to provide all the defined parameters.
        // Otherwise, it will result in a compilation error.
        this.id = id;
        this.name = name;
        this.description = description;
    }

    private int id;
    private String name;
    private String description;
    private String price;
    private String stockAmount;
}
