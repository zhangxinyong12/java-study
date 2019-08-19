package Date0819;

public class Animal {
    public  String name;
    public Animal(String name){
       this.name=name;
    }

    public String getName() {
        return this.name;
    }
    public  void  eat(){
        System.out.println(getName()+"动物会吃食物");
    }
}
