package CloneExample;

public class Helper implements Cloneable{
    private String name;
    private int age;

    public Helper(Helper x) {
        this.deepCopy(x);
    }

    public Helper(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Helper() {
    }


    //    @Override
//    public String toString() {
//        return "Helper{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void shallowCopy(Helper x) {
        this.name = x.name;
        this.age = x.age;
    }

    public void deepCopy(Helper x) {
        this.setName(x.getName());
        this.setAge(x.getAge());
    }

    @Override
    public Helper clone() throws CloneNotSupportedException {
        return (Helper) super.clone();
    }
}
