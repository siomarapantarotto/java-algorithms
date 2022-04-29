package Hashtable;

import java.util.Iterator;
import java.util.Hashtable;
import java.util.Set;

public class HashtableIterator1 {

    public static void main (String[] args) {

        String key;

        Hashtable<String, String> hashtable = new Hashtable<>();

        hashtable.put("A", "blue");
        hashtable.put("B", "green");
        hashtable.put("C", "red");
        hashtable.put("D", "black");
        hashtable.put("E", "Yellow");

        Set<String> keys = hashtable.keySet();
        Iterator<String> iterator = keys.iterator();
        
        System.out.println("\nHashtable contains:");
        while(iterator.hasNext()) {
            key = iterator.next();
            System.out.println("Key: " + key + "\tValue: " + hashtable.get(key));
        }

    }

}
