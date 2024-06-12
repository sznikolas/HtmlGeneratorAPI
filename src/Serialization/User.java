package Serialization;

import java.io.Serializable;

public class User implements Serializable {

    //versioning
    private static final long serialVersionUID = 1L;
    String name;
    //Fields declared as "transient" aren't serialized, they're ignored
    transient String password;

    public void sayHello() {
        System.out.println("Hello " +name);
    }
}
