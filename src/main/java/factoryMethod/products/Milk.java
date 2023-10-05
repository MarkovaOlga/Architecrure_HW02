package factoryMethod.products;

import factoryMethod.Product;

public class Milk extends Product {
    @Override
    public void price() {
        System.out.println("Цена молока - 80");
    }
}
