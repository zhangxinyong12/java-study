package Date0729;

public class Animal {
    private  int age;
    private  String name;
    public  Animal(int age,String name){
        this.age=age;
        this.name=name;
    }
    public  int ageAdd(int age){
        return  age++;
    }
    public  String getName(){
        return  this.name;
    }
    public  void  eat(){
        System.out.println("动物们再吃");
    }

}
