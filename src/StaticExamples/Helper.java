package StaticExamples;

public class Helper {

    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " " + price + " " + name);
    }
    public int data = 5;
    public static int counter;

    public Helper() {
        counter++;
    }


    public static void increase () {
        counter++;

    }

     public static void increase (Helper obj) {
        obj.data++;
     }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}
