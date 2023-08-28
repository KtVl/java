public class TaskWithNumbersOfCodewars7kyu {
    public static void main(String[] args) {
        System.out.println(isSquare(25));
        System.out.println(isSquare2(25));
        System.out.println(hero(4,5));
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

    /*Герой направляется в замок, чтобы выполнить свою миссию.
Однако ему сказали, что замок окружен парочкой могущественных драконов!
каждому дракону требуется 2 пули, чтобы быть побежденным, наш герой понятия не имеет,
сколько пуль он должен нести.. Предполагая, что он собирается схватить
определенное количество пуль и двигаться вперед, чтобы сразиться с другим заданным количеством драконов,
выживет ли он?
Верните true, если да, иначе false*/
    public static boolean hero(int bullets, int dragons) {
        return bullets / 2 >= dragons;
    }
}
