public class Date0603 {
    public static void main(String[] args) {
//        int i = 9;
//        switch (i) {
//            case 0:
//                System.out.println(i);
//                break;
//            case 2:
//                System.out.println(i);
//                break;
//            case 90:
//                System.out.println(i);
//                break;
//            case 10:
//                System.out.println(i);
//                break;
//            default:
//                System.out.println("不匹配执行");
//        }
//        System.out.println("-------------------------------------");
        /*
        多行注释
         */
        double randomVar = 0;
        while (randomVar < 0.5) {
            randomVar = Math.random();

        }
        System.out.println(">0.5的数是" + randomVar);
        System.out.println("----------------------------------");
        int rangeStart = 30;
        int rangeEnd = 90;
        int mod = rangeEnd - rangeStart;
        int bigRandom = (int) (Math.random() * rangeEnd * 100);
        for (int i = 0; i < 50; i++) {
            int numberToGuess = (int) (Math.random() * mod + rangeStart);
            System.out.println(i+"mod=" + mod + ",bigRandom=" + bigRandom + ",numberToGuess=" + numberToGuess);

        }
    }
}
