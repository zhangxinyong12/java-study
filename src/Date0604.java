public class Date0604 {
    public static void main(String[] args) {
        int[] list = new int[20];
        for (int i = 0; i < 20; i++) {
            list[i] = i;
        }
        System.out.println(list[0]);
        System.out.println("----------------");
        int[][] arrList = new int[3][8];
        System.out.println(arrList);
        for (int i = 0; i < arrList.length; i++) {
            for (int y = 0; y < arrList[i].length; y++) {
                arrList[i][y] = (int) (Math.random() * 100);
            }
        }
        ;
        System.out.println("----------");
        int maxArr = 0;
        for (int i = 0; i < arrList.length; i++) {
            for (int y = 0; y < arrList[i].length; y++) {
                if (arrList[i][y] >= maxArr) {
                    maxArr = arrList[i][y];
                }
            }
        }
        System.out.println("maxArr=" + maxArr);
        int[] arr = {156, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // for-each 循环
        System.out.println("--------------------");
        for(int item:arr){
            System.out.println(item);
        }
    }
}
