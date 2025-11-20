import java.util.Scanner;

public class InputHandler {
    private Scanner sc = new Scanner(System.in);

    public Product createProduct() {

        System.out.print("Enter product name: ");
        String name = sc.nextLine().trim();
        while (name.isEmpty()) {
            name = sc.nextLine().trim();
        }

        System.out.print("Enter quantity available: ");
        int qty = readIntSafe();

        System.out.print("Enter weekly usage: ");
        int usage = readIntSafe();

         System.out.print("Enter price per unit: ");
         double price = readDoubleSafe(); 

       return new Product(name, qty, usage, price);
    }

    public int getInt(String message) {
        System.out.print(message);
        return readIntSafe();
    }

    
    public void clearBuffer() {
        sc.nextLine();
    }

    private int readIntSafe() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.print("Invalid number! Enter again: ");
            }
        }
    }
    private double readDoubleSafe() {
    while (true) {
        try {
            return Double.parseDouble(sc.nextLine().trim());
        } catch (Exception e) {
            System.out.print("Invalid price! Enter again: ");
        }
    }
}

}
