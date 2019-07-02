package Date0712;

import Date0626.Cat;

public class Date0712 {
    public static void main(String[] args) {
        Cat cat=new Cat("zhang",2,23,34,"red");
        System.out.println(cat.getAge(2));
        // 构造方法重载
        Cat cat1=new Cat("zhang",2,23,34);
        System.out.println(cat1.color);
    }
}
