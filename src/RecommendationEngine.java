public class RecommendationEngine {

    //  Find MOST critical product
    public Product findMostCritical(GroceryList list) {

        Product mostCritical = null;
        double lowestDaysLeft = Double.MAX_VALUE;

        for (int i = 0; i < list.getCount(); i++) {
            Product p = list.getProducts()[i];

            // Days left = quantity divided by daily usage
            double dailyUsage = p.getWeeklyUsage() / 7.0;
            double daysLeft = p.getQuantity() / dailyUsage;

            if (daysLeft < lowestDaysLeft) {
                lowestDaysLeft = daysLeft;
                mostCritical = p;
            }
        }
        return mostCritical;
    }

    // B — Find all products running out within X days
    public Product[] findRunningOutSoon(GroceryList list, int days) {

        Product[] temp = new Product[list.getCount()];
        int idx = 0;

        for (int i = 0; i < list.getCount(); i++) {
            Product p = list.getProducts()[i];

            double dailyUsage = p.getWeeklyUsage() / 7.0;
            double daysLeft = p.getQuantity() / dailyUsage;

            if (daysLeft < days) {
                temp[idx++] = p;
            }
        }

        Product[] result = new Product[idx];
        for (int i = 0; i < idx; i++) {
           result[i] = temp[i];
        }

        return result;
    }
}
