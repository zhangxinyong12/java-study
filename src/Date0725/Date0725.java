package Date0725;

import java.text.SimpleDateFormat;
import java.util.*;

public class Date0725 {
//    用程序要求线程安全的情况下，则必须使用 StringBuffer 类。
    public static void main(String[] args) throws InterruptedException {
        StringBuffer sBuffer = new StringBuffer("菜鸟教程");
        sBuffer.append(1);
        sBuffer.append("你好啊");
        System.out.println(sBuffer);
        StringBuffer sb1= sBuffer.reverse(); // 反转
        System.out.println(sb1);
        System.out.println(sb1.replace(0,2,"替换的内容"));
        System.out.println(sBuffer.indexOf("-鸟")); // -1 没有
        System.out.println(sBuffer.capacity());
        String str = sBuffer.toString();
        System.out.println(str);
        System.out.println("---------------------");
        int[] arr=new int[20];
        for(int i=0;i<20;i++){
            arr[i]=i;
        }
        System.out.println(arr[19]);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int total = 0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        System.out.println(total);
        arr[19] = 2000;
        double max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        for (int item:arr) {
            System.out.println(item);
        }
        arr[0] = 200;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // 时间类
        Date date = new Date();
        System.out.println(date.toInstant());
        System.out.println(date.toString());
        System.out.println(date.getTime());
        // 使用 SimpleDateFormat
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(ft.format(date));
        Thread.sleep(1000*3);   // 休眠3秒
        System.out.println(new Date());
    }
}
