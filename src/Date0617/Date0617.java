package Date0617;

public class Date0617 {
    public static void main(String[] args) {
        System.out.println("null缺省值");
        People zhangsan=new People();
        zhangsan.name="zhangsan";
        zhangsan.age=23;
        zhangsan.sex="nan";
        System.out.println(zhangsan);
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}
