package Date0625;

public class Cat {
     String name;
      int age;
     String color;
      int a=20;

    /**
     *
     * @param name 重新的名字
     */
     public void testThis(String name){
         a=30;
         System.out.println(this.name);
         this.name=name;
         System.out.println(name);
     }
}
