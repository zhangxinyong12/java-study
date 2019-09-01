package Date0819;

import java.util.Arrays;
import java.util.Objects;

public class Cat extends Animal {
    public String name;
    public String[] arr1 = new String[10];
    public final String[] arr = arr1;


    public Cat(String name) {
        super("猫:" + name);
    }

    public String getName() {

        return super.getName();
    }

    public String getName(int x) {

        return "动物";
    }

    public void eat() {

        System.out.println(getName() + "喵喵叫");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return getName().equals(cat.getName()) &&
                Arrays.equals(arr1, cat.arr1) &&
                Arrays.equals(arr, cat.arr);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName());
        result = 31 * result + Arrays.hashCode(arr1);
        result = 31 * result + Arrays.hashCode(arr);
        return result;
    }

    public void catchMice() {
        System.out.println("猫会捉耗子");
    }
}
