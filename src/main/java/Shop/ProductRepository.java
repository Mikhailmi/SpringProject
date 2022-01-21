package Shop;



import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Component
public class ProductRepository {
    private final Map<Integer, Product> products = new ConcurrentHashMap<Integer, Product>();

    {
        products.put(1, new Product(1, "Product 1", 110));
        products.put(2, new Product(2, "Product 2", 20));
        products.put(3, new Product(3, "Product 3", 300));
        products.put(4, new Product(4, "Product 4", 444));
        products.put(5, new Product(5, "Product 5", 55));

    }

    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    public void saveOrUpdate(Product product) {
        if (product.getId() == 0) {
            int id = (products.size() + 1);
            product.setId(id);
        }
        products.put(product.getId(), product);
    }

    public Product findById(int id) { return products.get(id); }

    public void deleteById(int id) {
        products.remove(id);
    }



    }

