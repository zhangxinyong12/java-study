package Date0801;

import java.io.*;
import java.util.Scanner;

public class Date0801 {
//    public static void main(String[] args) throws IOException {
//        char c;
//        // 使用 System.in 创建 BufferedReadr
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("输入字符，按下'q'退出");
//        do {
//            c= (char) br.read();
//            System.out.println(c);
//        }while (c != 'q');
//    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//        String str;
//        System.out.println("enter lines of text.");
//        System.out.println("enter 'end' to quit.");
//        do {
//            str =br.readLine();
//            System.out.println(str);
//        }while (!str.equals("end"));
//    }
    public static void main(String[] args) {
//        textFile();
        testScanner();
    }
    public  static  void  testScanner(){
        Scanner scan = new Scanner(System.in);
        System.out.println("next 方式接收");
        if(scan.hasNext()){
            String str1=scan.next();
            System.out.println("输入的数据是"+str1);
        }
        scan.close();
    }
    public static void  textFile(){
        try {
            byte bWrite[] = { 11, 21, 3, 40, 5 };
            OutputStream os = new FileOutputStream("test.txt");
            for (int x = 0; x < bWrite.length; x++) {
                os.write(bWrite[x]); // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.print((char) is.read() + "  ");
            }
            is.close();
        } catch (IOException e) {
            System.out.print("出错 Exception");
        }
    }

}
