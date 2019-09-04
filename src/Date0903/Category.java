package Date0903;

public enum Category {
    // 必须再开始的时候，创建所有的枚举对象
    FOOD(10),
    COOK(3),
    SNACK(5),
    CLOTHES(7),
    ELECTRIC(9);
    // 可以有属性
    private  int id;
    // 构造方法必须是private 不写也是private
     Category(int id){
        this.id=id;
    }
    public  int getId(){
        return  id;
    }
    @Override
    public String toString(){
        return  "Category{"+"id="+id+"}";
    }
}
