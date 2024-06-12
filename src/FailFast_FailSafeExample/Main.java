package FailFast_FailSafeExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            if (itr.next() == 2) {
                // will not throw Exception
                itr.remove(); // OK!
            }
        }
        System.out.println("""
                If during iteration over a Collection, 
                an item is removed using Iterator‘s remove() method, that’s entirely safe and doesn’t throw an exception.
                """);

        System.out.println(al);

//        System.out.println("Fail fast:");
//        itr = al.iterator();
//        while (itr.hasNext()) {
//            if (itr.next() == 3) {
//                // will throw Exception on
//                // next call of next() method
//                al.remove(3); // EXCEPTION!
//            }
//        }

        System.out.println("Non-Fail Fast Iterator");
        System.out.println("""
                These iterators make a copy of the internal collection (object array) and iterates over the copied collection.
                Any structural modification done to the iterator affects the copied collection,
                not original collection. So, original collection remains structurally unchanged. 
                """);

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("First", 10);
        map.put("Second", 20);
        map.put("Third", 30);
        map.put("Fourth", 40);
//        System.out.println(map + " : " + map.values());
        map.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println("*************************");

        Iterator<String> iterator = map.keySet().iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " : " + map.get(key));
            map.put("Fifth", 50);
        }
        System.out.println("*************************");
        map.forEach((key, value) -> System.out.println(key + " : " + value));

    }
}
