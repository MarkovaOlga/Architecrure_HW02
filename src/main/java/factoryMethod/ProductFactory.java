package factoryMethod;

import factoryMethod.products.*;

public class ProductFactory {
    public Product createProduct(String productType) {
        if ("bread".equalsIgnoreCase(productType)) {
            return new Bread();
        } else if ("chocolate".equalsIgnoreCase(productType)) {
            return new Chocolate();
        } else if ("milk".equalsIgnoreCase(productType)) {
            return new Milk();
        } else if ("potato".equalsIgnoreCase(productType)) {
            return new Potato();
        } else if ("spaghetti".equalsIgnoreCase(productType)) {
            return new Spaghetti();
        } else {
            throw new IllegalArgumentException("Такого продукта нет в базе");
        }

    }
}
