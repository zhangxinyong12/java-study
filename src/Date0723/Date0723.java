package Date0723;

public class Date0723 {
    public static void main(String[] args) {
        // StringBuilder 是可变的 每次都返回this 可以链式调用
        StringBuilder strB=new StringBuilder();
        long val=123456;
        strB.append(val).append("张新永");
        System.out.println(strB);
        System.out.println(strB.reverse());
        System.out.println(strB.reverse());
        System.out.println(strB.delete(2,4));
        System.out.println(strB.insert(0,"开始"));
    }
}
