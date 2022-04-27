package HashTable;

import java.util.Set;
import java.util.Map;
import java.util.Hashtable;
import java.util.Iterator;
;
public class HashTableSort
{
    public static void main(String args[])
    {
       Hashtable<Integer, String> ht= new Hashtable<Integer, String>();
       ht.put(10, "Carlos");
       ht.put(1, "Amanda");
       ht.put(11, "Toninho");
       ht.put(9, "Zeno");
       ht.put(3, "Ana");
 
       // Get a set of the entries
       Set set = ht.entrySet();
       // Get an iterator
       Iterator i = set.iterator();
       // Display elements
       while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
   }
}
