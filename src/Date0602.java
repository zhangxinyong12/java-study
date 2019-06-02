public class Date0602 {
    public static void main(String[] args) {
        int outer =100;
        {
            int inner=10;
            System.out.println("outer="+outer+";;;inner"+inner);
        }
//        System.out.println(inner);   // 变量局部作用域
        for (int i=1;i<=9;i++){
            String line="";
            for(int j=1;j<=i;j++){
                line+=i+"*"+j+"="+(i+j)+"\t";
            }
            System.out.println(line);

        }
        System.out.println("---------------------------");
        int n=10;
        int dividend=100;
        int divisor=980000000;
//        int divisor=9800;
        int found=0;
        while (found<n){
            if(dividend<0){
                System.out.println("出现溢出情况");
                break;
            }
            if(dividend%divisor == 0){
                found++;
                System.out.println(found+"个；"+dividend+"可以整除"+divisor+",商为"+(dividend/divisor));
            }
            dividend++;
        }
        System.out.println("---------------------");
        do {
            System.out.println("先执行这个。至少会执行一次");
        }while (false);
    }
}
