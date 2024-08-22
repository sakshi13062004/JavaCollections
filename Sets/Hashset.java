package JavaCollections.Sets;

import java.util.HashSet;
import java.util.Set;



public class Hashset {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<Integer>();
hs.add(10);
hs.add(20);
System.err.println(hs.contains(20));
hs.add(10);
for(int e:hs){
    System.err.println(e);

}
    }
}
