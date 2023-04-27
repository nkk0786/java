import java.util.Scanner;

public class PharmacyStoreManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice, stock = 0;
        float price = 0.0f;
        String itemName = "";

        do {
            System.out.println("Please choose an option:");
            System.out.println("1. Add new item to stock");
            System.out.println("2. Update stock of an item");
            System.out.println("3. Update price of an item");
            System.out.println("4. Display stock of an item");
            System.out.println("5. Exit");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    itemName = input.next();
                    System.out.print("Enter item price: ");
                    price = input.nextFloat();
                    System.out.print("Enter item stock: ");
                    stock = input.nextInt();
                    System.out.println(itemName + " added to stock.");
                    break;
                case 2:
                    System.out.print("Enter item name: ");
                    itemName = input.next();
                    System.out.print("Enter new stock: ");
                    stock = input.nextInt();
                    System.out.println("Stock of " + itemName + " updated.");
                    break;
                case 3:
                    System.out.print("Enter item name: ");
                    itemName = input.next();
                    System.out.print("Enter new price: ");
                    price = input.nextFloat();
                    System.out.println("Price of " + itemName + " updated.");
                    break;
                case 4:
                    System.out.print("Enter item name: ");
                    itemName = input.next();
                    System.out.println("Stock of " + itemName + " is " + stock + ", and price is " + price);
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (choice != 5);
    }
}
