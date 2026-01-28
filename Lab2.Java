import java.util.ArrayList;
import java.util.Arrays;

public class Lab2 {
    public static void main(String[] args) {

        // Lab 2 – COMP1008 Programming Fundamentals
        // Topic: Arrays & ArrayLists
        // Name: Mohammad Ali Bokhari

        // ================================================
        // STEP 1: Create an array of grocery items (String)
        // ================================================
        String[] groceries = {
                "Milk",
                "Eggs",
                "Bread",
                "Apples",
                "Oranges",
                "Rice"
        };

        // ================================================
        // STEP 2: Print the array using Arrays.toString()
        // ================================================
        System.out.println("Grocery Array:");
        System.out.println(Arrays.toString(groceries));

        // ================================================
        // STEP 3: Transfer all array items into an ArrayList
        // ================================================
        ArrayList<String> groceryList = new ArrayList<>();

        for (int i = 0; i < groceries.length; i++) {
            groceryList.add(groceries[i]);
        }

        // ================================================
        // STEP 4: Modify the ArrayList
        // ================================================
        groceryList.add("Cheese");
        groceryList.add("Yogurt");
        groceryList.remove("Eggs");

        System.out.println("\nUpdated Grocery List:");
        System.out.println(groceryList);

        // ================================================
        // STEP 5: Count items that start with a vowel
        // ================================================
        int vowelCount = 0;

        for (String item : groceryList) {
            String lowerItem = item.toLowerCase();

            if (lowerItem.startsWith("a") ||
                lowerItem.startsWith("e") ||
                lowerItem.startsWith("i") ||
                lowerItem.startsWith("o") ||
                lowerItem.startsWith("u")) {
                vowelCount++;
            }
        }

        // ================================================
        // STEP 6: Print final results
        // ================================================
        System.out.println("\nNumber of items starting with a vowel: " + vowelCount);
    }
}
