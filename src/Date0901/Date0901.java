package Date0901;

import Date0819.Cat;

import java.lang.reflect.Field;


public class Date0901 {

    private static Class catCalzz;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
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
//        System.out.println(str1 == str2   );
//        System.out.println(str1.equals(str2));
        Class clazz = str1.getClass();
        System.out.println(clazz);
        System.out.println(clazz.getSimpleName());
        printArr(1);
        printArr(1, 2, 34);
        Cat cat = new Cat("my_cat");
        catCalzz = cat.getClass();
        Field field = catCalzz.getField("name");
        System.out.println(field);

    }

    private static void printObj(Object obj) {
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println(obj.getClass());
        System.out.println(obj.hashCode());
    }

    private static void printArr(int a, int... arges) {
        System.out.println(arges);

    }
}
