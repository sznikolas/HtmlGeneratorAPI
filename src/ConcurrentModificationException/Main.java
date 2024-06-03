package ConcurrentModificationException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>(Arrays.asList("KORTE", "ALMA", "REPA", "DINNYE"));
        System.out.println("ArrayList before removing elements: " + show(fruits));
        show(fruits);


//***************************************************
        //it cause ConcurrentModificationException !!!!
//        for(String fruit : fruits) {
////            if(fruit.equals("ALMA")) {
//            if("ALMA".equals(fruit)) {
//                fruits.remove(fruit);
//            }
//        }


//***************************************************
        //Collection.removeIf
        fruits.removeIf("ALMA"::equals);
//        fruits.forEach(System.out::println);
        System.out.println("After removing elements: " + show(fruits));

//***************************************************
        //Safe solution with Iterator
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.equals("DINNYE")) {
                iterator.remove();
            }
        }
//        fruits.forEach(System.out::println);
        System.out.println("After removing elements: " + show(fruits));

//***************************************************
        //Alternative solution where we gather elements to delete in a List, then separately remove them
        List<String> toRemove = new ArrayList<>();
        for (String fruit : fruits) {
            if (fruit.equals("KORTE")) {
                toRemove.add(fruit);
            }
        }
        // Remove elements
        fruits.removeAll(toRemove);

//        fruits.forEach(System.out::println);
        System.out.println("After removing elements: " + show(fruits));

    }


    public static String show(ArrayList<String> list) {
        return String.join(", ", list);

    }
}

