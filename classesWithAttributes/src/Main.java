public class Main {
    public static void main(String[] args) {

        // Classes have another characteristic: they contain properties (or attributes).
        Product product = new Product();
        product.name = "laptop";
        System.out.println(product.name);
        product.id = 1;
        product.description ="Asus Laptop";
        product.stockAmount = "5";
        product.price = "5000";

        ProductMenager productMenager = new ProductMenager();
        productMenager.Add(product);

        // As a programming principle, each class should have only one responsibility.
        // Here, we implemented the product's properties in one class and the product management in a separate class.

        product.getId1(); // We accessed the value of a private variable defined in the Product class.
        product.setId1(1); // The `id1` variable, which is defined as private in the Product class, can be modified.
    }
}