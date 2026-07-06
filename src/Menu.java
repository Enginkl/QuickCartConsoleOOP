import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Store store;
    private ShoppingCart cart;

    public Menu(){
        this.scanner = new Scanner(System.in);
        this.store = new Store();
        this.cart = new ShoppingCart();

        store.addProduct(new Product("1", "Apple", 0.99, 100));
        store.addProduct(new Product("2", "Banana", 0.59, 150));
        store.addProduct(new Product("3", "Tomato", 1.20, 80));
        store.addProduct(new Product("4", "Milk (1 Gallon)", 3.50, 40));
        store.addProduct(new Product("5", "Whole Wheat Bread", 2.49, 30));
        store.addProduct(new Product("6", "Eggs (12 Pack)", 4.20, 50));
        store.addProduct(new Product("7", "Cheddar Cheese", 5.99, 25));
        store.addProduct(new Product("8", "Bottled Water", 1.00, 200));
        store.addProduct(new Product("9", "Pasta", 1.50, 120));
        store.addProduct(new Product("10", "Rice (1 kg)", 2.99, 60));
    }

    public void start(){
        boolean isRunning = true;

        while(isRunning){
            System.out.println("\n=== MARKETSPHERE MENU ===");
            System.out.println("1. List Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. Checkout");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    store.listAllProducts();
                    break;

                case 2:
                    System.out.print("Enter the product ID: ");
                    String productID = scanner.nextLine();

                    Product selectedProduct = store.findProductById(productID);

                    if(selectedProduct != null){
                        System.out.print("Enter quantity: ");
                        int quantity = scanner.nextInt();
                        scanner.nextLine();

                        cart.addItemToCart(selectedProduct, quantity);
                    }
                    else{
                        System.out.println("ERROR: Product not found!");
                    }
                    break;

                case 3:
                    cart.checkout();
                    break;

                case 0:
                    System.out.println("Exiting System... Goodbye!");
                    isRunning = false;
                    break;

                default:
                    System.out.println("ERROR: Invalid input! Please try again!");
            }
        }
    }
}
