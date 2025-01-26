import java.util.ArrayList;
import java.util.Collections;
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

    private static void printMenu() {
        System.out.println("\nAvailable actions:");
        System.out.println("0 - to shutdown");
        System.out.println("1 - to add items to the list (comma-delimited list)");
        System.out.println("2 - to remove items from the list (comma-delimited list)");
    }

    private static void addItems(String items) {
        String[] itemsArray = items.split(",");
        for (String item : itemsArray) {
            String trimmedItem = item.trim();
            if (!groceryList.contains(trimmedItem) && !trimmedItem.isEmpty()) {
                groceryList.add(trimmedItem);
                System.out.println(trimmedItem + " added to the list.");
            } else if (groceryList.contains(trimmedItem)) {
                System.out.println(trimmedItem + " is already in the list.");
            }
        }
    }

    private static void removeItems(String items) {
        String[] itemsArray = items.split(",");
        for (String item : itemsArray) {
            String trimmedItem = item.trim();
            if (groceryList.contains(trimmedItem)) {
                groceryList.remove(trimmedItem);
                System.out.println(trimmedItem + " removed from the list.");
            } else {
                System.out.println(trimmedItem + " is not in the list.");
            }
        }
    }

    private static void printSortedGroceryList() {
        if (groceryList.isEmpty()) {
            System.out.println("The grocery list is currently empty.");
        } else {
            List<String> sortedList = new ArrayList<>(groceryList);
            Collections.sort(sortedList);
            System.out.println("Current grocery list (sorted): " + sortedList);
        }
    }
}