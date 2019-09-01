package Date0901;

public class Date0901 {
    public static void main(String[] args) {
        System.out.println("2019-09-01---------");
        Object obj = new Object();
        printObj(obj);
        Object obj1 = new Object();
        printObj(obj1);
        String str1 = "aaabbb";
        String str2 = "aaa" + "bbb";
        System.out.println("String---------------");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        // 打乱 Java 对S挺的优化
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入str1");
//        str1 = scanner.nextLine();
//        System.out.println("请输入str2");
//        str2 = scanner.nextLine();
//        System.out.println(str1 == str2);
//        System.out.println(str1.equals(str2));
        Class clazz =str1.getClass();
        System.out.println(clazz);
        System.out.println(clazz.getSimpleName());
    }

    private static void printObj(Object obj) {
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println(obj.getClass());
        System.out.println(obj.hashCode());
    }

    private static void printStr(String str) {

    }
}
