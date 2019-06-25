package Date0625;

public class Date0625 {
    public  int a=10;
    public static void main(String[] args) {
        Cat mycat = new Cat();
        mycat.name = "zhang";
//        System.out.println(mycat);
        Cat _mycat = ChangObject.changCat("wang");
//        System.out.println(_mycat.name);
        mycat.testThis("8888");
        System.out.println(mycat.name);
    }
}
