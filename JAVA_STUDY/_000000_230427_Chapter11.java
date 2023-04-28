import java.util.*;
import java.util.Set;
import java.util.ArrayList;
import java.util.function.Consumer;

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

        List<String> list = new ArrayList<String>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add(1,"one");
        list.add("five");

        System.out.println(list.size());
        System.out.println(list.indexOf("one"));
        System.out.println(list.get(2));
        System.out.println(list.lastIndexOf("one"));
        System.out.println(list.set(3,"four"));
        System.out.println(list.remove(4));
        System.out.println(list.remove("one"));

        Consumer<String> con1 = new Consumer<String>() {
            public void accept(String t){
                System.out.println(t);
            }
        };

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        list.forEach(con1);

        int[] narr1 = {1,2,3,4,5};

        for (int x : narr1){
            System.out.println(x);
        }
    }
}
