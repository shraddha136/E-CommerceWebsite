import java.util.List;
import java.util.Locale;
import java.util.Map;

public interface Search {
    List<Product> searchProductByName(String name);
    List<Product> searchProductByCategory(ProductCategory category);
}


class Catalog implements Search{

    Map<String,List<Product>> productListByName;
    Map<String,List<Product>> productListByCategory;

    @Override
    public List<Product> searchProductByName(String name) {
        return productListByName.get(name);
    }

    @Override
    public List<Product> searchProductByCategory(ProductCategory category) {
        return productListByCategory.get(category);
    }
}