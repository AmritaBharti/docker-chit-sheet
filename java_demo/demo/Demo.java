package demo;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        // Create a new LinkedList of Strings
        List<String> list = new LinkedList<>();
        
        // Add elements to the list
        list.add("Hello");
        list.add("World!");
        System.out.println("Added: " + list);
        
        // Remove an element from the list (the first occurrence, if present)
        boolean removed = list.remove("Hello");
        System.out.println("Removed 'Hello': " + removed);
        System.out.println("After removal: " + list);
        
        // Check whether the list contains a certain element
        boolean contains = list.contains("World!");
        System.out.println("Contains 'World!': " + contains);
        
        // Get the index of a specific element in the list  
        int index = list.indexOf("World!");
        System.out.println("Index of 'World!': " + index);
        
        // Insert an element at a specified position in the list  
        list.add(1, "Insertion");
        System.out.println("After insertion: " + list);
        
        // Create and use a custom iterator  
        Iterator<String> itr = list.iterator();
        while (itr.hasNext())  
            System.out.print(itr.next() + " "); 
        System.out.println();
        
        // Create a new ArrayList from the LinkedList
        
        
        ArrayList<String> arraylist = new ArrayList<>(list);
        
        // Perform operations on the ArrayList
        arraylist.add("Another element");
        System.out.println("ArrayList after addition: " + arraylist);   
    }
    }
