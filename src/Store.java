import java.util.ArrayList;

public class Store {
    private ArrayList<Product> products;

    public Store() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void listAllProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public Product findProductById(String id){
        for(Product product : products){
            if(product.getId().equals(id)){
                return product;
            }
        }
        return null;
    }

    public void updateStock(String id, int quantity){
        for(Product product : products){
            if(product.getId().equals(id)){
                product.setStockQuantity(product.getStockQuantity() + quantity);
                break;
            }
        }
    }

}
