package Date0819;

public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
        name = name;
    }

    public String getName() {
        return this.name;
    }

    public void eat() {
        System.out.println(getName() + "动物会吃食物");
    }

    public void sellp() {
        System.out.println("动物都会睡觉");
    }
}
