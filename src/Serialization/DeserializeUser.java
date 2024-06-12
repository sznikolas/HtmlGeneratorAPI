package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public class DeserializeUser {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User user = null;
        FileInputStream fileIn = new FileInputStream("C:\\Users\\Nikolas\\IdeaProjects\\HTMLGenerator\\UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();
        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);

    }
}
