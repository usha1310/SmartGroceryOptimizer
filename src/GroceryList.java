public class GroceryList {

    private Product[] products = new Product[10];
    private int count = 0;

    public void addProduct(Product p) {
        if (count < products.length) {
            products[count++] = p;
        }
    }

    public int getCount() {
        return count;
    }

    public Product[] getProducts() {
        return products;
    }

  
}
