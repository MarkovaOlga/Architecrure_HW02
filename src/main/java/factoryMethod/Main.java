package factoryMethod;

public class Main {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();

        Product bread = productFactory.createProduct("bread");
        bread.price();
        Product chocolate = productFactory.createProduct("chocolate");
        chocolate.price();
        Product milk = productFactory.createProduct("milk");
        milk.price();
        Product potato = productFactory.createProduct("potato");
        potato.price();
        Product spaghetti = productFactory.createProduct("spaghetti");
        spaghetti.price();
    }
}
