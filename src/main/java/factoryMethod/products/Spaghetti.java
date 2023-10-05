package factoryMethod.products;

import factoryMethod.Product;

public class Spaghetti extends Product {
    @Override
    public void price() {
        System.out.println("Цена макарон - 100");
    }
}
