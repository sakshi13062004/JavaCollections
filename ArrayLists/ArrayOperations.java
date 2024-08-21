package JavaCollections.ArrayLists;

import java.util.ArrayList;

class ArrayOperations{
    public static void main(String[] args) {
        ArrayList<String> fruits= new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        String firstFruit = fruits.get(0);
        //modify the array
        fruits.set(1,"mango");
        System.out.println("First fruit: "+ firstFruit);
        System.out.println("Modified array: "+ fruits);
        //remove an element
        fruits.remove(2);
        System.out.println("Array after removing an element: "+ fruits);
        //iterating through the array
        for(String s:fruits){
            System.out.println(s);
        }
        //checking if the array contains an element
        boolean hasApple= fruits.contains("orange");
        System.out.println("Array contains 'apple': "+hasApple);
        fruits.clear();
        boolean isEmpty = fruits.isEmpty();  // true after clearing

    }
}