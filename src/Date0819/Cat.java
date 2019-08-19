package Date0819;

public class Cat extends Animal {
    public String name;
    public  Cat(String name){
        super("猫:"+name);
    }
    public  String getName(){
        return  super.getName();
    }
    public  String getName(int x){
        return  "动物";
    }
    public  void  eat(){
        System.out.println(getName()+"喵喵叫");
    }

}
