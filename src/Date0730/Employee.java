package Date0730;

public abstract class Employee {
    private String name;
    private  String address;
    private  int number;
    public  Employee(String name,String address, int number){
        this.name=name;
        this.address=address;
        this.number=number;
    }
    public void  eat(){
        System.out.println("吃");
    }
    public  void setAddress(String address){
        address=address;
    }
    public  void setAddress(){
        address="暂无";
    }
    public  String getAddress(){
        return  address;
    }
}
