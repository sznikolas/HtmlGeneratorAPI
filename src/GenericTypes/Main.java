package GenericTypes;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer[] intArray = {1,2,3,4,5};
        String[] stringArray = {"A", "B", "C", "D"};

        System.out.println("********* GENERIC METHODS *********");
        displayArray(intArray);
        displayArray(stringArray);

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(stringArray));

        System.out.println("********* GENERIC CLASSES *********");
        System.out.println("public class MyGenericClass <T, T2>");

        MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
        MyGenericClass<Double> myDobule = new MyGenericClass<>(3.14);
        MyGenericClass<Character> myChar = new MyGenericClass<>('@');
        MyGenericClass<String> myString = new MyGenericClass<>("Hello");

        System.out.println(myInt.getValue());
        System.out.println(myDobule.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

        shout("John");
        shout(57);
        shout("Doe", 57);

        List<Integer> integerList = List.of(1,2,3,4,5);
        List<String> stringList = List.of("John", "Karol", "Ahmed");
        printList(integerList);
        printList(stringList);

        System.out.println(getFirst(stringList));
        System.out.println(getFirst(integerList));


        System.out.println("********* BOUNDED TYPES *********");
        //only accept numbers like integer, float, double, long ..
        System.out.println("public class MyGenericClass <T extends Number, T2 extends Number>");
    }

    public static <T> void displayArray(T[] array) {
        for(T x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static <T> T getFirst(T[] array) {
        return array[0];
    }
//    public static <T> T getFirst(List<T> list) {
//        return list.getFirst();
//    }

    public static <T> T getFirst(Collection<T> collection) {
        return collection.iterator().next();
    }

    public static <T> void shout(T t) {
        System.out.println(t + "!");
    }

    public static <T, V> void shout(T t, V v) {
        System.out.println(t + ", " + v + "!");
    }

    private static void printList(List<?> list) {
        System.out.println(list);
    }




}
