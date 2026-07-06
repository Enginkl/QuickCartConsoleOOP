import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> cartItems;
    private double totalAmount;

    public ShoppingCart(){
        cartItems = new ArrayList<>();
        totalAmount = 0;
    }

    public void addItemToCart(Product product, int quantity){
        if(quantity > 0 && product.getStockQuantity() >= quantity){
            for(int i=0;i<quantity;i++){
                cartItems.add(product);
            }
            System.out.println(quantity + "x " + product.getName() + " added.");
        }
        else{
            System.out.println("Invalid quantity or insufficient stock!");
        }
    }

    public void removeItemFromCart(Product product){
        cartItems.remove(product);
    }

    public void calculateTotal(){
        for(Product items : cartItems){
            totalAmount += items.getPrice();
        }
    }

    public void checkout(){

        if(cartItems.isEmpty()){
            System.out.println("ERROR: Your cart is empty! Cannot checkout.");
            return;
        }

        System.out.println("\n--- RECEIPT ---");
        calculateTotal();

        for(Product items : cartItems){
            System.out.println("- ID: " + items.getId() + " Name: " + items.getName() + " Price: $" + items.getPrice());

            items.setStockQuantity(items.getStockQuantity() - 1);
        }

        System.out.println("----------------------");
        System.out.printf("Total amount to be checked out is: $%.2f\n",totalAmount);
        System.out.println("Purchase Completed!");
    }
}
