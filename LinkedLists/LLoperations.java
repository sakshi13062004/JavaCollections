package JavaCollections.LinkedLists;

import java.util.LinkedList;

public class LLoperations {
    public static void main(String[] args) {
        
    
    LinkedList<String> list= new LinkedList<>();
    list.add("sakshi");
    list.add("akash");
    list.add(1,"shreya");
    System.out.println("Linked List after adding element at index 1: " + list);
    list.get(1);
    list.set(2,"god");
    System.out.println("Linked List after updating element at index 2: " + list);
    list.remove(0);
    System.out.println("Linked List after removing element at index 0: " + list);
    list.add("eat");
    list.add("sleep");
    list.removeFirst();
    list.removeLast();
    int size=list.size();
    for(String s:list){
        System.out.println(s);
    }
    boolean found= list.contains("eat");
    list.addFirst("tiger");
    list.addLast("alice");
    list.clear();
    

    }
}
