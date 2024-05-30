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
    }

}
