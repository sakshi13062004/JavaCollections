package JavaCollections.Maps;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "apple");
        map.put(2,"mango");
        map.put(3,"chennai");
        System.out.println("Original Map: " + map);
        map.get(3);
       System.out.println( map.containsKey(1));
       System.out.println(map.containsValue("mango"));
       map.remove(2);
       map.put(2,"sophia" );
       for(Integer key:map.keySet()){
        System.out.println("Key: "+key );

       }
       for(String val:map.values()){
        System.out.println("Value: "+val );
       }
       for(HashMap.Entry<Integer,String> entry:map.entrySet()){
        System.out.println("Key: "+entry.getKey() +" Value: "+entry.getValue() );
       }
       System.out.println("Size: " + map.size());
    }
}
