package factoryMethod.products;

import factoryMethod.Product;

public class Bread extends Product {
    @Override
    public void price() {
        System.out.println("Цена хлеба - 50");
    }
}
