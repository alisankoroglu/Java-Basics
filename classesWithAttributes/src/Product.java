public class Product {

    // These are the properties of a product. They are also called attributes or fields.
    int id;
    String name;
    String description;
    String price;
    String stockAmount;

    /*
    About encapsulation:
    If we define variables like above without an access modifier, they will have default access.
    Default access means they are accessible only within the same package.
    If we want to access these variables from other classes, we need to declare them as public.
    However, directly exposing fields breaks the encapsulation principle.
    Encapsulation means restricting direct access to variables and providing controlled access via getters and setters.
    To follow encapsulation, we should declare variables as private and create public getter and setter methods.
    */

    private int id1;
    private String name1;
    private String description1;
    private String price1;
    private String stockAmount1;

    // If we define variables as private like this, it means they are only accessible within the class they are defined in.
    // This is the core idea of encapsulation: keeping the internal data hidden from outside access.

    // Now we will talk about getter and setter methods.
    // A getter is used for reading the value of a variable (read-only).
    // A setter is used for updating the value of a variable (write).

    // Getter block
    public int getId1() {
        return id1;
        // By writing this kind of method, we can access the value of a private variable from another class.
        // It's like a function that gives us read access to the private field.
        // I will now switch to the main method and access it from there.
    }

    // Setter block
    public void setId1(int id1) {
        // id1 = id1; // This is allowed, but it's not correct because it assigns the parameter to itself.
        this.id1 = id1; // 'this' refers to the instance variable of the current class.
        // This way, we assign the value from the parameter to the class's private field.
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String getPrice1() {
        return price1;
    }

    public void setPrice1(String price1) {
        this.price1 = price1;
    }

    public String getStockAmount1() {
        return stockAmount1;
    }

    public void setStockAmount1(String stockAmount1) {
        this.stockAmount1 = stockAmount1;
    }

    // To avoid confusion and prevent issues like naming conflicts,
    // it's a best practice to add an underscore (_) prefix to private field names. For example: _id1, _name, _description, etc.

    // The standard naming convention for getter and setter methods is to start with 'get' or 'set' followed by the field name in camelCase.

    // Instead of manually writing each getter and setter, you can generate them automatically in most IDEs.
    // Simply right-click on the variable declaration, then go to Refactor > Encapsulate Field, select the variables you want,
    // choose whether to generate getters, setters, or both, and click Refactor to create them automatically.

}