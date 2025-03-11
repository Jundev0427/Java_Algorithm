package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cart = new HashMap<>();

    public void add(Product product, int quantity) {
        cart.put(product, cart.getOrDefault(product, 0) + quantity);
    }

    public void minus(Product product, int quantity) {
        /*
        if (cart.get(product) < quantity) {
            return;
        }

        if (cart.get(product) == quantity) {
            cart.remove(product);
            return;
        }

        cart.put(product, cart.get(product) - quantity);
         */

        Integer existingQuantity = cart.getOrDefault(product, 0);
        int newQuantity = existingQuantity - quantity;

        if(newQuantity <= 0){
            cart.remove(product);
        }else {
            cart.put(product, newQuantity);
        }
    }

    public void printAll() {
        System.out.println(cart);
    }
}
