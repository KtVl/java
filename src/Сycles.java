public class Сycles {
    public static void main(String[] args) {
        int[] arr = new int[5];
//        Общая форма записи цикла for:
//for (управляющая переменная; условие работы цикла; шаг) {
// // тело цикла
//}
        for (int i = 0; i < 5; i++) {
            arr[i] = i * 2;
            System.out.println(i + " - " + arr[i]);
        }

//        Пример цикла while
//        При данном условии сложно сказать
//сколько именно итераций требуется,
//поэтому проще использовать цикл while.

        int a = 3;
        while (a < 100000) {
            a = (a + 4) * a + 12;
            System.out.println(a);
        }

//        Циклы могут вкладываться друг в друга, количество уровней вложения циклом не
//ограничено. управляющая переменная
//внутреннего цикла имеет имя j, она не может иметь то же имя, что и у внешнего цикла.
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.println("i = " + i + "; j = " + j);
            }
        }

//        Оператор switch
//switch (переменная) {
// case константа1:
// последовательность операторов;
// break;
// case константа2:
// последовательность операторов;
// break;
// ...
// default:
// последовательность операторов;
//}
        int b = 10;
        switch (b) {
            case 10:
                System.out.println(1);
                break;
            case 15:
                System.out.println(2);
                break;
            case 20:
                System.out.println(3);
                break;
            default:
                System.out.println(4);
        }

// Аналог на if-else-if
        int c = 10;
        if (c == 10) {

            System.out.println(1);
        } else if (a == 15) {

            System.out.println(2);
        } else if (a == 20) {

            System.out.println(3);
        } else {

            System.out.println(4);
        }

    }

}
