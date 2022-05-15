package ArrayList.GroceryList;

import java.util.ArrayList;

public class GroceryList {
    public static ArrayList<String> groceryList = new ArrayList<String>();

    public void addItem(String item){
        groceryList.add(item);
        System.out.println(item + "Added to your list");
    }

    public void removeItem(int position){
        if(position > 0 && position <= groceryList.size()) {
            String item = groceryList.get(position);
            System.out.println(item + " Removed from your list");
            groceryList.remove(position);
            System.out.println("Items in your list: ");
            printGroceryList();
        }
        else{
            System.out.println("Index array out of bound");
            System.out.println("Items in your list: ");
            printGroceryList();
        }
    }

    public void modifyItem(int position, String newItem){
        System.out.println(newItem + " Modified with " + groceryList.get(position) );
        groceryList.set(position, newItem);
    }

    public String searchItem(String item){
        int position = groceryList.indexOf(item);
        if(position >= 0){
            return groceryList.get(position);
        }
        return null;
    }
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your list");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
}