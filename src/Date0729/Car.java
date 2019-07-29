package Date0729;

public class Car extends Animal {
    public Car(int age, String name) {
        super(age, name);
    }
    public  int ageAdd(int age){
        return age=age+4;
    }
    public void  eat(){
        super.eat();
        System.out.println(this.getName()+"在吃");
    }
}
