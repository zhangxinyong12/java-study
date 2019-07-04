package Date0626;

public class Date0626 {

    public static void main(String[] args) {
        Cat myCat=new Cat("wang",1,20,30,"red");
        myCat.init("wang",1,20,30,"red");

        System.out.println(Cat.add(2,3));
        Cat.price=1000;
        System.out.println(Cat.price);
        System.out.println(Cat.add(2,3));
        System.out.println(Cat.add(2));
    }
}
