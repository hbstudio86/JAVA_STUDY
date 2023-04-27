import java.util.*;
import java.util.Set;

public class _000000_230427_Chapter11 {
    public static void main(String[] args){
        Set<String> set = new HashSet<String>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");

        System.out.println(set.add(new String("one")));

        System.out.println(set.size());
        System.out.println(set.contains("Four"));
        System.out.println(set.contains("one"));
        System.out.println(set.contains(new String("one")));

        set.remove("Four");
        set.remove(new String("one"));
        System.out.println(set.size());

        set.clear();
        System.out.println(set.size());
    }
}
