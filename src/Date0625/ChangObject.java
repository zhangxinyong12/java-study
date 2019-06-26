package Date0625;

public class ChangObject {
   public static Cat mycat = new Cat();

    /**
     *
     * @param name 要重新的名字
     * @return 新的cat
     */
    public static Cat changCat(String name){
        mycat.name=name;
        return  mycat;
    }
}
