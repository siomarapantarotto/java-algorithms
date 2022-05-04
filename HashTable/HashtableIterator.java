package hashtable;

import java.util.Iterator;
import java.util.Hashtable;
import java.util.Set;

public class HashtableIterator {

    public static void main(String[] args) {

        // Creating a Hashtable instance
        Hashtable<String, String> hashtable = new Hashtable<>();

        // Adding key-value pairs to Hashtable
        hashtable.put("A", "blue");
        hashtable.put("B", "green");
        hashtable.put("C", "red");
        hashtable.put("D", "black");
        hashtable.put("E", "Yellow");

        System.out.println("\nIterating over Hashtable...");

        Set<String> keys = hashtable.keySet();
        Iterator<String> iterator = keys.iterator();
        String key;

        while (iterator.hasNext()) {
            key = iterator.next();
            System.out.println(key + " - " + hashtable.get(key));
        }

        System.out.println("Removing B...");

        hashtable.remove("B");

        System.out.println(hashtable);

    }

}
