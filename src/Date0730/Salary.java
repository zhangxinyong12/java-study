package Date0730;

public class Salary extends Employee {
    private  double salary;
    public  Salary(String name,String addres,int number, double salary){
        super(name,addres,number);
    }
    public void setSalary(double newSalary){
     if(newSalary>0.0){
         salary=newSalary;
     }
    }
    public  String getAddress(){
        return  "新的"+"gsdffklgsdf";
    }
}
