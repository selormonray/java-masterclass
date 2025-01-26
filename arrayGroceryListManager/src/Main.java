import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceryListManager {
    private static final List<String> groceryList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            printMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
            switch (choice) {
                case 0:
                    System.out.println("Shutting down...");
                    exit = true;
                    break;
                case 1:
                    System.out.print("Enter items to add (comma-delimited): ");
                    String itemsToAdd = scanner.nextLine();
                    addItems(itemsToAdd);
                    break;
                case 2:
                    System.out.print("Enter items to remove (comma-delimited): ");
                    String itemsToRemove = scanner.nextLine();
                    removeItems(itemsToRemove);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            printSortedGroceryList();
        }
        scanner.close();
}