package Test;

public class Main {
    public static void main(String[] args) {
        Integer i = 10;
        Integer j = 20;
        swap(i,j);
        System.out.println("i = " + i + " j = " + j);

        Integer[] arr = {10, 20};
        swap(arr);
        System.out.println("i = " + arr[0] + " j = " + arr[1]);

    }
    public static void swap(Integer i, Integer j) {
        Integer temp = i;
        i = j;
        j = temp;
    }
    //In Java, primitive types and their wrapper classes (such as Integer) are passed by value.
    // This means that when you pass an Integer to a method, you are passing a copy of the reference to the object,
    // not the actual reference itself. Therefore, changes to the reference inside the method
    // do not affect the original reference outside the method.
    
    // Mutable (változtatható): Az objektum állapota módosítható a létrehozása után.
    //Immutable (változtathatatlan): Az objektum állapota nem módosítható a létrehozása után.

    public static void swap(Integer[] arr) {
        Integer temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }


}
