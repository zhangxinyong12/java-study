package Date0625;

public class ChangObject {
   public static Cat mycat = new Cat();
    public static Cat changCat(String name){
        mycat.name=name;
        return  mycat;
    }
}
