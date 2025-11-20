public class Product {
    private String name;
    private int quantity;
    private int weeklyUsage;
    private double price;

    public Product(String name, int quantity, int weeklyUsage, double price) {
        this.name = name;
        this.quantity = quantity;
        this.weeklyUsage = weeklyUsage;
        this.price = price;
    }

    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public int getWeeklyUsage() { return weeklyUsage; }
    public double getPrice() { return price; }

    public void reduceQuantity(int used) {
        this.quantity -= used;
        if (this.quantity < 0) this.quantity = 0;
    }
     public double getMonthlyCost() {
        return weeklyUsage * price * 4;  // 4 weeks per month
    }
}
