public class Main {
    public static void main(String[] args) {

        GroceryList list = new GroceryList();
        InputHandler ih = new InputHandler();
        RecommendationEngine engine = new RecommendationEngine();

        System.out.println("=== SMART GROCERY OPTIMIZER ===");

        int n = ih.getInt("How many products do you want to enter (max 10)? ");

        ih.clearBuffer();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Product " + (i + 1));
            Product p = ih.createProduct();
            list.addProduct(p);
        }

       
         Product critical = engine.findMostCritical(list);
        System.out.println("\n=== MOST CRITICAL ITEM ===");

        double daily = critical.getWeeklyUsage() / 7.0;
        double daysLeft = critical.getQuantity() / daily;

        System.out.println("Item: " + critical.getName());
        System.out.println("Days left: " + String.format("%.1f", daysLeft));
        System.out.println("Status: BUY FIRST\n");

       
        // Items running out soon (within 7 days)
       
        System.out.println("=== ITEMS RUNNING OUT IN NEXT 7 DAYS ===");

        Product[] soon = engine.findRunningOutSoon(list, 7);

        if (soon.length == 0) {
            System.out.println("No items running out soon!");
        } else {
            for (Product p : soon) {
                double d = p.getWeeklyUsage() / 7.0;
                double left = p.getQuantity() / d;

                System.out.println("Item: " + p.getName());
                System.out.println("Days left: " + String.format("%.1f", left));
                System.out.println("Buy Soon: YES\n");
            }
        }

       
        // Monthly expense summary
        
        System.out.println("=== MONTHLY EXPENSE ESTIMATION ===");

        double totalMonthly = 0;
        for (int i = 0; i < list.getCount(); i++) {
            Product p = list.getProducts()[i];
            double cost = p.getMonthlyCost();
            totalMonthly += cost;

            System.out.println(p.getName() + " : Rs. " + cost);
        }

        System.out.println("---------------------------------");
        System.out.println("Total monthly expense: Rs. " + totalMonthly);
    }
}