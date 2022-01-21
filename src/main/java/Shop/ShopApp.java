package Shop;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;



import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.List;

@Component
public class ShopApp {

    private final ProductService productService;
    private CartServiceImpl cartService;

    public ShopApp(ProductService productService, CartServiceImpl cartService) {
        this.productService = productService;
        this.cartService = cartService;
    }

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(ShopConfig.class);

    }

    @PostConstruct
    private void cartInteract() throws IOException {
        Cart cart = cartService.getNewCart();
        System.out.println("\n----- ИНТЕРАКТИВНАЯ РАБОТА С КОРЗИНОЙ ------\n");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        boolean exit = false;
        while(!exit) {

            String str = in.readLine();
            if (!str.isEmpty()) {
                String[] parts = str.split("\\s");
                String command = parts[0];

                if (command.equalsIgnoreCase("exit")) {
                    exit = true;
                    System.out.println("Работа с магазином завершена");
                } else if (command.equals("list")) {

                   printList(productService.getProductList());
                }



            }
        }
    }

    private static void printList(List<?> list) {
        System.out.println("СПИСОК ПРОДУКТОВ:");
        for (Object el : list) {
            System.out.println(el.toString());
        }

    }


}
