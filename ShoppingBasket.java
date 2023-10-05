import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    private static ShoppingBasket instance;
    private List<Product> cart;

    private ShoppingBasket() {
        cart = new ArrayList<>();
    }

    public static ShoppingBasket getInstance() {
        if (instance == null) {
            instance = new ShoppingBasket();
        }
        return instance;
    }

    public void addToCart(Product product) {
        cart.add(product);
    }

    public List<Product> getCart() {
        return cart;
    }
}
