package factoryMethod.products;

import factoryMethod.Product;

public class Potato extends Product {
    @Override
    public void price() {
        System.out.println("Цена картофеля - 40");
    }
}
