package CloneExample;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Helper obj1 = new Helper("Janos", 21);
        Helper obj2 = new Helper("Csabi", 25);
        System.out.println(obj1);
        System.out.println(obj2);


//        //SHALLOW COPY -
//        System.out.println("Shallow copy");
//        obj2=obj1;
//        System.out.println(obj1.getName() + "\n" + obj1.getAge());
//        System.out.println(obj2.getName() + "\n" + obj2.getAge());
//        System.out.println("After change obj2 name:");
//        obj2.setName("Mark");
//        System.out.println(obj1.getName() + "\n" + obj1.getAge());
//        System.out.println(obj2.getName() + "\n" + obj2.getAge());

        //Deep copy
//        System.out.println("DEEP copy");
//        obj2.deepCopy(obj1);
//        System.out.println(obj1.getName() + "\n" + obj1.getAge());
//        System.out.println(obj2.getName() + "\n" + obj2.getAge());
//        System.out.println("After change obj2 name:");
//        obj2.setName("Balint");
//        System.out.println(obj1.getName() + "\n" + obj1.getAge());
//        System.out.println(obj2.getName() + "\n" + obj2.getAge());

        //COPY CONSTRUCTOR
//        System.out.println("COPY CONSTRUCTOR");
//        Helper obj3 = new Helper(obj1);
//        System.out.println(obj3);
//        System.out.println(obj1.getName() + "\n" + obj1.getAge());
//        System.out.println(obj3.getName() + "\n" + obj3.getAge());

        System.out.println("implements Cloneable - Clone OVERRIDING (deep copyt csinal)");
        Helper obj3;
        obj3 = obj1.clone();
//        Helper obj3 = (Helper) obj1.clone();
        System.out.println(obj3);
//        obj3.setAge(99);
        System.out.println(obj1.getName() + "\n" + obj1.getAge());
        System.out.println(obj3.getName() + "\n" + obj3.getAge());

        // CloneNotSupportedException !!! - marker interface, use for permissions
        //KELL implementalni a cloneable interfacet, kulonben barki hasznalhatna a
        // .clone() metodust es konnyen hozzaferhetnenek fontos adatainkhoz.

        //properly indexed json bz intellIJ
        // language=json
        String notMessyJson = """
                {
                    "name": "Will",
                    "occupation:": {
                        "jobTitle": "Tech Lead",
                        "programmingLanguage": "English"
                    }
                }
                """;





    }

}
