package Shop;

public interface CartService {
    Cart getNewCart();

    void addProduct (Cart cart, Product product, Integer quantity);
    void addProduct (Cart cart, Integer prodId, Integer quantity);

    void delProduct(Cart cart, Product product, Integer quantity);

    int getSum (Cart cart);

    void printCart (Cart cart);


    int getProductQuantity(Cart cart, Product product);
    int getProductQuantity(Cart cart, Integer prodId);
}
