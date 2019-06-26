package Date0626;

/**
 *
 */
public class Cat {
    public String name;
    public int id;
    public int age;
    public int weight;
    public String color;

    /**
     * @param name   名字
     * @param id     id
     * @param age    年龄
     * @param weight 体重
     * @param color  颜色
     */
    public void init(String name, int id, int age, int weight, String color) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public int getAge() {
        return age;
    }
    // 方法的重载
    // 签名 = 方法名 + 依次参数类型 ；不考虑返回值；要保证再一个类中是唯一标识
    // 依次使用 byte short int long float double
    public int getAge(int id) {
        id = 0;
        return this.age;
    }
    public int getAge(double flag) {
        return this.id;
    }
}
