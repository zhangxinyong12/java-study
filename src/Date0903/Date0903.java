package Date0903;

public class Date0903  {
    public static  void main(String[] args) {
        for(Category category:Category.values()){
            System.out.println("++++++"+category.getId()+"++++++");
            System.out.println(category.ordinal());
            System.out.println(category.name());
            System.out.println(category.toString());
        }
        System.out.println("-----------");
        System.out.println(Category.valueOf("FOOD"));
//        System.out.println(Category.valueOf("food"));
        System.out.println("++++++emun++++++");
        Category _food=Category.FOOD;
        System.out.println(_food);
        System.out.println("++++++instance+++++++");
        Products goods=new Products();
        ExpireDateMerchandise _goods=goods;
        System.out.println(goods.getExpireDate());
        System.out.println(_goods.getExpireDate());

    }

}
