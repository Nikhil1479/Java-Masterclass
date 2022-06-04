package ArrayList.GroceryList;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice;
        printInstructions();

        while (!quit) {
            System.out.println("Enter your Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0 -> printInstructions();
                case 1 -> groceryList.printGroceryList();
                case 2 -> addItem();
                case 3 -> modifyItem();
                case 4 -> removeItem();
                case 5 -> searchItem();
                case 6 -> quit = true;
            }
        }
    }

    public static void printInstructions() {

        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print list of items");
        System.out.println("\t 2 - To add an item to list");
        System.out.println("\t 3 = To modify an item");
        System.out.println("\t 4 - To remove an item");
        System.out.println("\t 5 - To search an item in the list");
        System.out.println("\t 6 - Exit");
    }

    public static void addItem() {
        System.out.println("Enter an Item you want to add in the list: ");
        groceryList.addItem(sc.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Enter index number: ");
        int itemNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter new Item: ");
        String itemName = sc.nextLine();

        groceryList.modifyItem(itemNo - 1, itemName);
    }

    public static void removeItem() {
        System.out.println("Enter item number: ");
        int itemNo = sc.nextInt();
        sc.nextLine();
        groceryList.removeItem(itemNo - 1);
    }

    public static void searchItem() {
        System.out.println("Enter An Item you want to search: ");
        String itemName = sc.nextLine();

        if (groceryList.searchItem(itemName) != null) {
            System.out.println("Found " + itemName + " in our list");
        }
    }
}