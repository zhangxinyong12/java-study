package Date0819;

public class Date0819<arr> {

    public static void main(String[] args) {
        System.out.println("1111111111111111");
        Cat cat = new Cat("小猫");
        String catName = cat.getName();
        System.out.println(catName);
        cat.eat();
        System.out.println(cat.getName(1));

        Animal dog = new Animal("小狗");
        System.out.println(dog instanceof Animal);
        System.out.println(dog instanceof Cat);
        cat.sellp();

        if (cat instanceof Animal) {
            Animal animal = (Animal) cat;
            animal.sellp();
        }
        int[] arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=i;
        }
        for(int item:arr){
            System.out.println(item);
        }

    }
}
