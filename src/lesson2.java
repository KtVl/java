//public class lesson2 {
//    public static void main(String[] args) {
//        checkSumSign(5, 10);
//        checkSumSign(-2, -10);
//        checkSumSign(-5, 10);
//        checkSumSign(5, -10);
//    }
//        public static void checkSumSign(int a, int b) {
//            System.out.println(a + b >= 0 ? "Сумма положительная" : "Сумма отрицательная");
//        }
//}
// методы с параметрами.

public class lesson2 {
    public static void main(String[] args) {
        boolean result = checkSumSign(5, 10);
        System.out.println(result? "Сумма положительная" : "Сумма отрицательная");
    }
    public static boolean checkSumSign(int a, int b) {
        return a + b >= 0;
    }
}