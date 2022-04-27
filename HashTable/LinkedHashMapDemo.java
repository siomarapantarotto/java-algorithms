package HashTable;

import java.util.*;
public class LinkedHashMapDemo
{
   public static void main(String args[])
   {
       LinkedHashMap<Integer, String> lhm= new LinkedHashMap<Integer, String>();
       lhm.put(10, "Chaitanya");
       lhm.put(1, "Ajeet");
       lhm.put(11, "Test");
       lhm.put(9, "Demo");
       lhm.put(3, "Anuj");
 
       // Get a set of the entries
       Set set = lhm.entrySet();
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
