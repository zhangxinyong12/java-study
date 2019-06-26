package Date0626;

public class Date0626 {

    public static void main(String[] args) {
        Cat myCat=new Cat();
        myCat.init("wang",1,20,30,"red");

        System.out.println(myCat.getAge());
        System.out.println(myCat.getAge(20));

    }
}
