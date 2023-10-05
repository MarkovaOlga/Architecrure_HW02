package factoryMethod.products;

import factoryMethod.Product;

public class Chocolate extends Product {
    @Override
    public void price() {
        System.out.println("Цена шоколада - 130");
    }
}
