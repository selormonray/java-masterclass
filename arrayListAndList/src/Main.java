import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        create an array of objects
        GroceryItem[] groceryArray = new GroceryItem[3];
        /*Declaring your arrays with a specific type allows
        compile-time type checking, as you can see here.
        Type checking at compile-time prevents runtime
        exceptions when instances assigned to arrays */

        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));


        /*
         * creating a grocery list using the ArrayList class instead of an array.
         * */
        ArrayList objectList = new ArrayList();

//        add entries to the array list
        objectList.add(new GroceryItem("butter"));
        objectList.add("Yoghurt");


//        specify a type for ArrayList
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
    }

    //    create a record called grocery item pwith 3 fields
    record GroceryItem(String name, String type, int count) {

        public GroceryItem(String name) {
            this(name, "DAIRY", 1);
        }
    }
}