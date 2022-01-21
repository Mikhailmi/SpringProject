package Shop;

import java.util.List;

public interface ProductService {

    List<Product> getProductList();

    void saveOrUpdate(Product product);

    Product getProductById(Integer id);

    void deleteById(Integer id);

}
