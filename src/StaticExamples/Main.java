package StaticExamples;

public class Main {
    public static void main(String[] args) {

        Helper A = new Helper();
        Helper B = new Helper();

        Helper.increase();
        System.out.println("Helper counter: " + Helper.counter);

        int a = 5;
        int b = 5;


//        Helper.increase(A);

        System.out.println("A data: " + A.data);
        System.out.println("B data: " + B.data);

        System.out.println("StaticData: " + Helper.counter);
        A.increase();
        System.out.println("Static data after A increase: " + Helper.counter);
        B.increase();
        System.out.println("Static data after B increase: " + Helper.counter);
        System.out.println("StaticData: " + Helper.counter);

        String asd = "Hello";
        System.out.println(asd);
        System.out.println(Helper.reverse(asd));


        String s1 = "Hello";
        String s2 = new String("Hello");
        System.out.println("s1 == s2, verifies the equality of memory addresses: " + (s1 == s2));
        System.out.println("s1.equals(s2), verifies the content of the memory values: " + s1.equals(s2));
        System.out.println("s1.equals(s2), verifies the content of the memory values: " + s2.equals(s1));
        //The first  verifies the equality of memory addresses. However, the second  verifies the content of the memory values.
        //A String osztály esetében az equals metódus úgy van felüldefiniálva, hogy a stringek karakterlánc tartalmát hasonlítja össze,
        // így még akkor is, ha két különböző String objektumot hozunk létre (különböző referenciák),
        // ha azok tartalma megegyezik, az equals metódus true értéket ad vissza.

        Helper obj = new Helper();
        obj.brand = "Apple";
        obj.price = 1500;
//        obj.name = "Smartphone";

        Helper obj2 = new Helper();
        obj2.brand = "Samsung";
        obj2.price = 1300;

        Helper.name = "Phone";

        obj.show();
        obj2.show();


    }

}
