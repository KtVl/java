public class TaskWithNumbersOfCodewars7kyu {
    public static void main(String[] args) {
        System.out.println(isSquare(25));
        System.out.println(isSquare2(25));
    }
    //Учитывая целое число, определите, является ли оно квадратным
    public static boolean isSquare(int n) {
        int squareRoot = (int) Math.sqrt(n);
        int tst = squareRoot;
        return tst*tst == n;
    }
// второй вариант решения
    public static boolean isSquare2(int n) {
        return Math.sqrt(n) % 1 == 0;
    }
}
