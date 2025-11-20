public class History {
    private String[] purchasedItems = new String[10];
    private int index = 0;

    public void addPurchase(String itemName) {
        if (index < purchasedItems.length) {
            purchasedItems[index] = itemName;
            index++;
        }
    }

    public String[] getPurchasedItems() {
        return purchasedItems;
    }
}
